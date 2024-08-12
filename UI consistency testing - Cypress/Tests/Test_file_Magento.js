import Homepage_Magento from '../../support/pageObjects/webdriver-uni/Homepage_Magento';
import Login_Page_Magento from '../../support/pageObjects/webdriver-uni/Login_page_Magento';

/// <reference types="cypress" />
describe('Verify the UI consistency', () => {
    const homepage_Magento = new Homepage_Magento();
    const login_Page_Magento = new Login_Page_Magento();
    beforeEach(function () {
        cy.fixture('magento').then((data) => {
            this.data = data;
        });

        homepage_Magento.visitHomepage();
        cy.clearCookies();
        cy.reload();
    });

    it('Verify consistency of Radiant Tee item name after clicking', function () {
      login_Page_Magento.verifyRadiantTee();
    });
    it('Verify consistency of Radiant Tee item price after clicking', function () {
        login_Page_Magento.verifyRadiantTee1();

    });
    it('Verify consistency of Radiant Tee item image after clicking', function () {
        login_Page_Magento.verifyRadiantTee2();
        });
    
    
    it('Verify consistency of Breathe-Easy Tank item name after clicking', function() {
        login_Page_Magento.verifyBreatheEasyTank();
       
    });
    
    it('Verify consistency of Breathe-Easy Tank item price after clicking', function () {
        login_Page_Magento.verifyBreatheEasyTank1();
    });
    it('Verify consistency of  Breathe-Easy Tank image after clicking', function () {
        login_Page_Magento.verifyBreatheEasyTank2();
    });
    it('Verify consistency of Argus All-Weather Tank item name after clicking', function() {
        login_Page_Magento.verifyArgusAllWeatherTank();
    });
    it('Verify consistency of Argus All-Weather Tank item price after clicking', function () {
        login_Page_Magento.verifyArgusAllWeatherTank1();
    });
    it('Verify consistency of Argus All-Weather Tank image after clicking', function () {
        login_Page_Magento.verifyArgusAllWeatherTank2();
    });
    it('Verify consistency of Hero Hoodie item name after clicking', function() {
        login_Page_Magento.verifyHeroHoodie();
    });
    it('Verify consistency of Hero Hoodie item price after clicking', function () {
        login_Page_Magento.verifyHeroHoodie1();
    });
    it('Verify consistency of Hero Hoodie image after clicking', function () {
        login_Page_Magento.verifyHeroHoodie2();
    });
    it('Verify consistency of Fusion Backpack item name after clicking', function() {
        login_Page_Magento.verifyFusionBackpack();
    });
    it('Verify consistency of Fusion Backpack item price after clicking', function () {
        login_Page_Magento.verifyFusionBackpack1();
    });
    it('Verify consistency of Fusion Backpack image after clicking', function () {
        login_Page_Magento.verifyFusionBackpack2();
        });

    it('Verify consistency of Push It Messenger Bag item name after clicking', function() {
        login_Page_Magento.verifyPushItMessengerBag();
    });
    it('Verify consistency of Push It Messenger Bag item price after clicking', function () {
        login_Page_Magento.verifyPushItMessengerBag1();
    });
    it('Verify consistency of Push It Messenger Bag image after clicking', function () {
        login_Page_Magento.verifyPushItMessengerBag2();
    });
});

  


