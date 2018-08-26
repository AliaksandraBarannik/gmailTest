$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ebayPutProductInBasket.feature");
formatter.feature({
  "line": 2,
  "name": "Check the product in the basket",
  "description": "",
  "id": "check-the-product-in-the-basket",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ebay"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "check-the-product-in-the-basket;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I opened ebay HomePage to search the product",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I searched product \"Samsung galaxy S6\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I clicked on the first product",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I added the product to the basket and opened the basket",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I checked the product \"Samsung Galaxy S6\" was in the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "EbayCheckProductInBasketDef.iOpenedEbayHomePage()"
});
formatter.result({
  "duration": 9718186992,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samsung galaxy S6",
      "offset": 20
    }
  ],
  "location": "EbayCheckProductInBasketDef.iSearchedTheProduct(String)"
});
formatter.result({
  "duration": 4507208592,
  "status": "passed"
});
formatter.match({
  "location": "EbayCheckProductInBasketDef.iClickedOnTheFirstProduct()"
});
formatter.result({
  "duration": 4630447694,
  "status": "passed"
});
formatter.match({
  "location": "EbayCheckProductInBasketDef.iAddedTheProductToTheBasketAndOpenedTheBasket()"
});
formatter.result({
  "duration": 3330743756,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samsung Galaxy S6",
      "offset": 23
    }
  ],
  "location": "EbayCheckProductInBasketDef.iCheckedTheProductWasInTheBasket(String)"
});
formatter.result({
  "duration": 433102997,
  "status": "passed"
});
formatter.uri("ebaySearch.feature");
formatter.feature({
  "line": 2,
  "name": "Search product",
  "description": "",
  "id": "search-product",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ebay"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Running a Full Text Quick Search",
  "description": "",
  "id": "search-product;running-a-full-text-quick-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I opened ebay HomePage to search the product",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I searched product \"Samsung galaxy S6\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the product \"Samsung galaxy S6\" should be the first in the Search Result grid",
  "keyword": "Then "
});
formatter.match({
  "location": "EbayCheckProductInBasketDef.iOpenedEbayHomePage()"
});
formatter.result({
  "duration": 1920345850,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samsung galaxy S6",
      "offset": 20
    }
  ],
  "location": "EbayCheckProductInBasketDef.iSearchedTheProduct(String)"
});
formatter.result({
  "duration": 4064199375,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samsung galaxy S6",
      "offset": 13
    }
  ],
  "location": "EbayCheckProductInBasketDef.theProductShouldBeTheFirstInTheSearchResultGrid(String)"
});
formatter.result({
  "duration": 571282232,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Running a Full Text Quick Search",
  "description": "",
  "id": "search-product;running-a-full-text-quick-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "I opened ebay HomePage to search the product",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I searched product \"\u003crequest\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the product \"\u003crequest\u003e\" should be the first in the Search Result grid",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "search-product;running-a-full-text-quick-search;",
  "rows": [
    {
      "cells": [
        "request"
      ],
      "line": 16,
      "id": "search-product;running-a-full-text-quick-search;;1"
    },
    {
      "cells": [
        "Samsung galaxy S6"
      ],
      "line": 17,
      "id": "search-product;running-a-full-text-quick-search;;2"
    },
    {
      "cells": [
        "Lenovo ideapad 320"
      ],
      "line": 18,
      "id": "search-product;running-a-full-text-quick-search;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Running a Full Text Quick Search",
  "description": "",
  "id": "search-product;running-a-full-text-quick-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ebay"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I opened ebay HomePage to search the product",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I searched product \"Samsung galaxy S6\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the product \"Samsung galaxy S6\" should be the first in the Search Result grid",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "EbayCheckProductInBasketDef.iOpenedEbayHomePage()"
});
formatter.result({
  "duration": 3447799211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samsung galaxy S6",
      "offset": 20
    }
  ],
  "location": "EbayCheckProductInBasketDef.iSearchedTheProduct(String)"
});
