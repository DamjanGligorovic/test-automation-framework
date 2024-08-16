class HomePageSasomange {
    constructor(page) {
        this.page = page;
    }

    async navigate() {
        try {
            
            await this.page.goto("https://sasomange.rs/uloguj-se", { waitUntil: 'networkidle' });
        } catch (error) {
            console.error("Failed to navigate to the page:", error);
        }
    }
}

module.exports = HomePageSasomange;
