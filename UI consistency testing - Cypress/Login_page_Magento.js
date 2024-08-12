class Magento {
    verifyRadiantTee() {
        cy.url().should('include', "https://magento.softwaretestingboard.com/");
        cy.title().should('include', "Home Page");
        cy.get('.product-item-info').eq(0).contains('Radiant Tee').invoke('text').then((itemBeforeClick) => {
        cy.get('.product-item-info').eq(0).click();
        cy.url().should('include', "/radiant-tee.html");
        cy.title().should('include', "Radiant Tee");
        cy.get('.base', { timeout: 30000 }).should('have.text', itemBeforeClick.trim());
            });
    }
    verifyRadiantTee1() {
        cy.url().should('include', "https://magento.softwaretestingboard.com/");
        cy.title().should('include', "Home Page");
        cy.get('.product-item-info').eq(0).contains('$22.00').invoke('text').then((itemBeforeClick) => {
        cy.get('.product-item-info').eq(0).click(); 
        cy.url().should('include', "/radiant-tee.html");
        cy.title().should('include', "Radiant Tee");
        cy.get('#product-price-1556 > span', { timeout: 30000 })
        .should('have.text', itemBeforeClick.trim());
            });
            
    }
    verifyRadiantTee2() {
        cy.url().should('include', "https://magento.softwaretestingboard.com/");
        cy.title().should('include', "Home Page");
        const expectedSrc = 'https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/w/s/ws12-orange_main_2.jpg';
        cy.get('.product-item-info').eq(0).click();
        cy.url().should('include', "/radiant-tee.html");
        cy.title().should('include', "Radiant Tee");
        cy.get("[src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/d34482110da20c5e24f97c38fb219fb3/w/s/ws12-orange_main_2.jpg']", { timeout: 30000 }).invoke('attr', 'src').then((actualSrc) => {
        expect(actualSrc).to.not.equal(expectedSrc);
            });
            
    }
    verifyBreatheEasyTank() {
        cy.url().should('include', "https://magento.softwaretestingboard.com/");
        cy.title().should('include', "Home Page");
        cy.get('.product-item-info').eq(1).contains('Breathe-Easy Tank').invoke('text').then((itemBeforeClick) => {
        cy.get('.product-item-info').eq(1).click()
        cy.url().should('include', "/breathe-easy-tank.html");
        cy.title().should('include', "Breathe-Easy Tank");
        cy.get('.base', {timeout: 30000}).should('have.text', itemBeforeClick.trim());
            });
            
    }
    verifyBreatheEasyTank1() {
        cy.url().should('include', "https://magento.softwaretestingboard.com/");
        cy.title().should('include', "Home Page");
        cy.get('.product-item-info').eq(1).contains('$34.00').invoke('text').then((itemBeforeClick) => {     
        cy.get('.product-item-info').eq(1).click();
        cy.url().should('include', "/breathe-easy-tank.html");
        cy.title().should('include', "Breathe-Easy Tank");
        cy.get('#product-price-1812 > span', { timeout: 30000 }).should('have.text', itemBeforeClick.trim());
        });
            
    }
    verifyBreatheEasyTank2() {
        cy.url().should('include', "https://magento.softwaretestingboard.com/");
        cy.title().should('include', "Home Page");
        const expectedSrc = '[src="https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/w/t/wt09-white_main_1.jpg"]';
        cy.get('.product-item-info').eq(1).click();
        cy.url().should('include', "/breathe-easy-tank.html");
        cy.title().should('include', "Breathe-Easy Tank");
        cy.get("[src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/d34482110da20c5e24f97c38fb219fb3/w/t/wt09-white_main_1.jpg']", { timeout: 30000 }).invoke('attr', 'src').then((actualSrc) => {
        expect(actualSrc).to.not.equal(expectedSrc);
        });
    }
        verifyArgusAllWeatherTank() {
        cy.visit("https://magento.softwaretestingboard.com/");
        cy.url().should('include', "https://magento.softwaretestingboard.com/");
        cy.title().should('include', "Home Page");
        cy.get('.product-item-info').eq(2).contains('Argus All-Weather Tank').invoke('text') .then((itemBeforeClick) => {
        cy.get('.product-item-info').eq(2).click();
        cy.url().should('include', "/argus-all-weather-tank.html");
        cy.title().should('include', "Argus All-Weather Tank");
        cy.get('.base', { timeout: 30000 })
        .should('have.text', itemBeforeClick.trim());
        });
}
verifyArgusAllWeatherTank1() {
    cy.url().should('include', "https://magento.softwaretestingboard.com/");
    cy.title().should('include', "Home Page");
    cy.get('.product-item-info').eq(2).contains('$22.00').invoke('text').then((itemBeforeClick) => {     
    cy.get('.product-item-info').eq(2).click();
    cy.url().should('include', "/argus-all-weather-tank.html");
    cy.title().should('include', "Argus All-Weather Tank");
    cy.get('#product-price-694', { timeout: 30000 }).should('have.text', itemBeforeClick.trim());
    });
}
verifyArgusAllWeatherTank2() {
    cy.url().should('include', "https://magento.softwaretestingboard.com/");
        cy.title().should('include', "Home Page");
        const expectedSrc = '[src="https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/m/t/mt07-gray_main_1.jpg"]';
        cy.get('.product-item-info').eq(2).click();
        cy.url().should('include', "/argus-all-weather-tank.html");
        cy.title().should('include', "Argus All-Weather Tank");
        cy.get("[src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/d34482110da20c5e24f97c38fb219fb3/m/t/mt07-gray_main_1.jpg']", { timeout: 30000 }).invoke('attr', 'src').then((actualSrc) => {
        expect(actualSrc).to.not.equal(expectedSrc);
        });
    }
    verifyHeroHoodie() {
        cy.url().should('include', "https://magento.softwaretestingboard.com/");
                    cy.title().should('include', "Home Page");
                    cy.get('.product-item-info').eq(3).contains('Hero Hoodie').invoke('text').then((itemBeforeClick) => {
                    cy.get('.product-item-info').eq(3).click()
                    cy.url().should('include', "/hero-hoodie.html");
                    cy.title().should('include', "Hero Hoodie");
                    cy.get('.base', {timeout: 30000}).should('have.text', itemBeforeClick.trim());
                    });
        }
        verifyHeroHoodie1() {
            cy.url().should('include', "https://magento.softwaretestingboard.com/");
            cy.url().should('include', "https://magento.softwaretestingboard.com/");
            cy.title().should('include', "Home Page");
            cy.get('.product-item-info').eq(3).contains('$54.00').invoke('text').then((itemBeforeClick) => {     
            cy.get('.product-item-info').eq(3).click();
            cy.url().should('include', "/hero-hoodie.html");
            cy.title().should('include', "Hero Hoodie");
            cy.get('#product-price-158 > span', { timeout: 30000 }).should('have.text', itemBeforeClick.trim());
            });
            }
            verifyHeroHoodie2() {
                cy.url().should('include', "https://magento.softwaretestingboard.com/");
                cy.title().should('include', "Home Page");
                const expectedSrc = '[src="https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/m/h/mh07-gray_main_2.jpg"]';
                cy.get('.product-item-info').eq(3).click();
                cy.url().should('include', "/hero-hoodie.html");
                cy.title().should('include', "Hero Hoodie");
                cy.get("[src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/d34482110da20c5e24f97c38fb219fb3/m/h/mh07-gray_main_2.jpg']", { timeout: 30000 }).invoke('attr', 'src').then((actualSrc) => {
                expect(actualSrc).to.not.equal(expectedSrc);
                });
                }
                verifyFusionBackpack() {
                    cy.url().should('include', "https://magento.softwaretestingboard.com/");
                    cy.title().should('include', "Home Page");
                    cy.get('.product-item-info').eq(4).contains('Fusion Backpack').invoke('text').then((itemBeforeClick) => {
                    cy.get('.product-item-info').eq(4).click()
                    cy.url().should('include', "/fusion-backpack.html");
                    cy.title().should('include', "Fusion Backpack");
                    cy.get('.base', {timeout: 30000}).should('have.text', itemBeforeClick.trim());
                    });
                    }
                    verifyFusionBackpack1() {
                        cy.url().should('include', "https://magento.softwaretestingboard.com/");
                        cy.title().should('include', "Home Page");
                        cy.get('.product-item-info').eq(4).contains('$59.00').invoke('text').then((itemBeforeClick) => {     
                        cy.get('.product-item-info').eq(4).click();
                        cy.url().should('include', "/fusion-backpack.html");
                        cy.title().should('include', "Fusion Backpack");
                        cy.get('#product-price-6 > span', { timeout: 30000 }).should('have.text', itemBeforeClick.trim());
                        });
                    }
                        verifyFusionBackpack2() {
                            cy.url().should('include', "https://magento.softwaretestingboard.com/");
                            cy.title().should('include', "Home Page");
                            const expectedSrc = '[src="https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/m/b/mb02-gray-0.jpg"]';
                            cy.get('.product-item-info').eq(4).click();
                            cy.url().should('include', "/fusion-backpack.html");
                            cy.title().should('include', "Fusion Backpack");
                            cy.get("[src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/d34482110da20c5e24f97c38fb219fb3/m/b/mb02-gray-0.jpg']", { timeout: 30000 }).invoke('attr', 'src').then((actualSrc) => {
                            expect(actualSrc).to.not.equal(expectedSrc);
                            });
                        }
                        verifyPushItMessengerBag() {
                            cy.url().should('include', "https://magento.softwaretestingboard.com/");
                            cy.title().should('include', "Home Page");
                            cy.get('.product-item-info').eq(5).contains('Push It Messenger Bag').invoke('text').then((itemBeforeClick) => {
                            cy.get('.product-item-info').eq(5).click();
                            cy.url().should('include', "/push-it-messenger-bag.html");
                            cy.title().should('include', "Push It Messenger Bag");
                            cy.get('.base', {timeout: 30000}).should('have.text', itemBeforeClick.trim());

                            });
                        }
                            verifyPushItMessengerBag1() {
                                cy.url().should('include', "https://magento.softwaretestingboard.com/");
                                cy.title().should('include', "Home Page");
                                cy.get('.product-item-info').eq(5).contains('$45.00').invoke('text').then((itemBeforeClick) => {     
                                cy.get('.product-item-info').eq(5).click();
                                cy.url().should('include', "/push-it-messenger-bag.html");
                                cy.title().should('include', "Push It Messenger Bag");
                                cy.get('#product-price-14 > span', { timeout: 30000 }).should('have.text', itemBeforeClick.trim());
                                });
                            }
                                verifyPushItMessengerBag2() {
                                    cy.url().should('include', "https://magento.softwaretestingboard.com/");
                                    cy.title().should('include', "Home Page");
                                    const expectedSrc = '[src="https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/w/b/wb04-blue-0.jpg"]';
                                    cy.get('.product-item-info').eq(5).click();
                                    cy.url().should('include', "/push-it-messenger-bag.html");
                                    cy.title().should('include', "Push It Messenger Bag");
                                    cy.get('[src="https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/d34482110da20c5e24f97c38fb219fb3/w/b/wb04-blue-0.jpg"]', { timeout: 30000 }).invoke('attr', 'src').then((actualSrc) => {
                                    expect(actualSrc).to.not.equal(expectedSrc);
                                    });
                        }
}

export default Magento;