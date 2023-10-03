# Demo project for <a href="https://xn--b1agwec.xn--p1ai/">Booking.com</a>

## 📖 Contents:

- [Technologies and tools](#technologies-and-tools)
- [Test cases](#test-cases)
- [How to run tests from terminal](#how-to-run-tests-from-terminal)
- [How to run tests using Jenkins](#how-to-run-tests-using-jenkins)
- [Allure reports](#allure-report-example)
- [Integration with Allure TestOps](#allure-test-ops)
- [Integration with Jira](#jira)
- [Telegram notifications](#telegram-notifications)
- [Test video](#test-video)

## ⚙ <a name="tecnologies-and-tools"></a>Technologies and tools
<p align="left">
<a href="https://www.jetbrains.com/idea/"><img src="media/logos/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="media/logos/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://github.com/"><img src="media/logos/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="media/logos/JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="media/logos/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://selenide.org/"><img src="media/logos/Selenide.svg" width="50" height="50" alt="Selenide" title="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="media/logos/Selenoid.svg" width="50" height="50" alt="Selenoid" title="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/logos/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://qameta.io/"><img src="media/logos/Allure_TO.svg" width="50" height="50" alt="Allure TestOps" title="Allure TestOps"/></a>
<a href="https://www.jenkins.io/"><img src="media/logos/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
<a href="https://www.atlassian.com/ru/software/jira"><img src="media/logos/Jira.svg" width="50" height="50" alt="Jira" title="Jira"/></a>
<a href="https://web.telegram.org/"><img src="media\logos\Telegram.svg" width="50" height="50" alt="Telegram" title="Telegram"></a>
</p>

Autotests written on <code>Java</code> using <code>Selenide</code> and <code>JUnit5</code> frameworks. Project builds from <code>IntelliJ Idea</code> with <code>Gradle</code>. Tests can be run from <code>Jenkins</code> on remote server with <code>Selenoid</code>.  

Results visualised with <code>Allure Report</code> and <code>Telegram Bot</code>.

Allure report contains:
- Test steps
- Screenshot after last step
- Page source
- Browser console logs
- Video of the test run

## ✔️ <a name="test-cases"></a>Test cases

- some cases

## 💻 <a name="how-to-run-tests-from-terminal"></a>How to run tests from terminal

```
gradle clean test (params)
```

Tests will be launched remotely with <code>Selenoid</code>.

## <img width="4%" style="vertical-align:middle" title="Jenkins" src="media/logos/Jenkins.svg"><a name="how-to-run-tests-using-jenkins"></a> How to run tests using <a href='' title="Jenkins build">Jenkins</a>

To run the tests click <code>Build with parametes</code> and then click <code>Build</code>.
<p align="center">
<img title="Jenkins Build" src="media/screenshots/jenkins.PNG">
</p>
After build is complete, at <code>Builds history</code> you can find <code>Allure Report</code> icon, click on which will allow you to see html-report of the test run.

## <img width="4%" style="vertical-align:middle" title="Allure Report" src="media/logos/Allure_Report.svg"><a name="allure-report-example"></a> <a href=''>Allure</a> report example
### Overview

<p align="center">
<img title="Allure Overview" src="media/screenshots/allure_report.PNG">
</p>

### Test details

<p align="center">
<img title="Allure Details" src="media/screenshots/allure_details.PNG">
</p>

## <img width="4%" style="vertical-align:middle" title="Allure TestOps" src="media/logos/Allure_TO.svg"><a name="allure-test-ops"></a> Integration with <a href=''>Allure TestOps</a>

<p align="center">
<img title="Allure TestOps" src="media/screenshots/allure_TO.PNG">
</p>

## <img width="4%" style="vertical-align:middle" title="Jira" src="media/logos/Jira.svg"><a name="jira"></a> Integration with <a href=''>Jira</a>

<p align="center">
<img title="Jira" src="media/screenshots/jira.PNG">
</p>


## <img width="4%" style="vertical-align:middle" title="Telegram" src="media/logos/Telegram.svg"><a name="telegram-notifications"></a> Telegram notifications

After test run you can receive a notification to an email of messenger of choice. For example, <code>Telegram</code>.

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/screenshots/telegram.PNG">
</p>

## 🎥 <a name="test-video"></a>Test video

To every report can be attached not only screenshots, but also videos of tests.

<p align="center">
  <img title="Selenoid Video" src="media/video/video.gif">
</p>
