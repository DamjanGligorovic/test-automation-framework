const { defineConfig } = require("cypress");

module.exports = defineConfig({
  projectId: 'unui9u',
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
    specPattern: "cypress/tests/webdriver_uni/**/*.{js,jsx,ts,tsx,feature}",
    excludeSpecPattern: "cypress/tests/other/*.js",
    baseUrl: "https://magento.softwaretestingboard.com/",
    video: true,
 
    reporter: 'cypress-multi-reporters',
    reporterOptions: {
      configFile: 'reporter-config.json'
    },
    chromeWebSecurity: false,
    experimentalSessionAndOrigin: true,
    defaultCommandTimeout: 30000,
    pageLoadTimeout: 120000,
    screenshotOnRunFailure: true,
    trashAssetsBeforeRuns: true,
    retries:{
      runMode: 0,
      openMode: 1,
    },
    env: {
      
      //webdriveruni_homepage: "http://www.webdriveruniversity.com",
      pcpress_homepage: "https://pcpress.rs/prodavnica/index.php",
      sasomange_registrationpage: "https://sasomange.rs/registracija",
      sasomange_loginpage: "https://sasomange.rs/uloguj-se",
      magento_homepage:"https://magento.softwaretestingboard.com/"
    }
  },
});
