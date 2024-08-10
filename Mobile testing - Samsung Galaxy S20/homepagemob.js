class HomePage {
    constructor(page, isMob) {
        this.page = page;
    }

    async navigate() {
        await this.page.goto("https://saucelabs.com/");
    }
}

module.exports = HomePage;
