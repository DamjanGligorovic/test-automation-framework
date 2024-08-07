class HomePage {
    constructor(page) {
        this.page = page;
    }

    async navigate() {
        await this.page.goto("https://pcpress.rs/prodavnica/index.php")
    }
}

module.exports = HomePage;