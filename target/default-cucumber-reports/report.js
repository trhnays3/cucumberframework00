$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/automation_practice_TC3.feature");
formatter.feature({
  "name": "Search product",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@testcase3"
    }
  ]
});
formatter.scenario({
  "name": "Automation Practise 3",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@testcase3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user web sayfasinda",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.AutomationPractiseStepDef.user_web_sayfasinda()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "imleci Women linkinin uzerine ve daha sonra Tshirts\u0027e tiklayin",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AutomationPractiseStepDef.imleci_Women_linkinin_uzerine_ve_daha_sonra_Tshirts_e_tiklayin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sayfada gorunen ilk urunun textini alin",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AutomationPractiseStepDef.sayfada_gorunen_ilk_urunun_textini_alin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sayfada ustte bulunan arama cubuguna ayni urun ismini girin ve search butonuna basin",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AutomationPractiseStepDef.sayfada_ustte_bulunan_arama_cubuguna_ayni_urun_ismini_girin_ve_search_butonuna_basin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acilan sayfada cikan urunun T-Shirt sayfasinda goruntulenen urunle ayni oldugunu dogrulayin",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AutomationPractiseStepDef.acilan_sayfada_cikan_urunun_T_Shirt_sayfasinda_goruntulenen_urunle_ayni_oldugunu_dogrulayin()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});