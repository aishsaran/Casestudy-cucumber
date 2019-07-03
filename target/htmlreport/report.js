$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/skeleton/case4.feature");
formatter.feature({
  "name": "check cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The one where the user moves to cart without adding any item in it",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "alex has registered in to TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "Case4check.alex_has_registered_in_to_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Alex search a particular product like headphone",
  "keyword": "When "
});
formatter.match({
  "location": "Case4check.alex_search_a_particular_product_like_headphone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "try to proceed to payment without adding any item in the cart",
  "keyword": "And "
});
formatter.match({
  "location": "Case4check.try_to_proceed_to_payment_without_adding_any_item_in_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TestMEapp doesn\u0027t display the cart icon",
  "keyword": "Then "
});
formatter.match({
  "location": "Case4check.testmeapp_doesn_t_display_the_cart_icon()"
});
formatter.result({
  "status": "passed"
});
});