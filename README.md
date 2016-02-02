# jsf-play
a sample project to get started with jsf

## Java SDK
Download current Java SDK e.g. http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html. In the text the corresponding install directory is referred to through JDK_INSTALL_DIR. 

## Wildfly
Download 10.0.0.Final version of Wildfly from http://wildfly.org/downloads/, simply unpack the contents, the resulting top level directory is referred to through WILDFLY_DIR

## Eclipse IDE
Download Eclipse for JEE devlopers, e.g. https://eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/mars/1/eclipse-jee-mars-1-win32-x86_64.zip
Unzip to some folder, and start eclipse. Start a workspace for instance in SOME_PROJECTS_FOLDER/jsfPlay/eclipseWS you can later put sources into SOME_PROJECTS_FOLDER/jsfPlay/git.

### Change installed JREs default in Eclipse
In Eclipse goto preferences (Window &gt; Preferences ...) from the preferences categories on the left select Java &gt; Installed JREs. activate the Add... function, choose Standard VM and the use the Directory... function to select JDK_INSTALL_DIR (see above). Eclipse should be able to read in the JRE system libraries and propse a name. Click Finish amd mark the added jdk from the Installed JREs list, to make it the default jdk used by eclipse for projects.

### Configure proxy usage in Eclipse
Adapt your proxy settings so that you are able to reach the internet via eclipse. Do this in the preferences Window &gt; Preferences &gt; General &gt; Network Connection

### Connect the Application Server in Eclipse
In Eclipse open the server view through Window &gt; Servers. Right Click and select New &gt; Server. If no JBoss based Server has been connected before, select Red Hat JBoss Middleware &gt; JBoss AS, Wildfly, & EAP Server Tools, this will install required plugins. After installation of the plugins again go to the Servers view and right click it. Select New &gt; Server. On the *Define a New Server* page of the poping up wizard goto JBoss Community and select the appropriate server version class (e.g. WildFly 10.0). If you are sticking purely to this guide, leave the other fields unchanged. Goto to the next wizard page named Create a new Server Adapter, again if you stick to this guide don't change anything and go to the next page. On the JBoss Runtime page set the *Home Directory* to WILDFLY_DIR (see above), change the Runtime JRE to the previously installed JDK via *Alternate JRE*. The other fields can be left unchanged.

The Servers view should now show the server, shich you should be able to start via right click > Start. Per default you should be able to reach the server via the browser using the URL http://localhost:8080. Stop the server via the handle in the Eclipse Servers view by right click > Stop.

## Clone the sample project from github via Eclipse
In Eclipse create a new Project by checking it out from git. Use File &gt; New &gt; Other ... &gt; Maven &gt; Check out Maven Projects from SCM. If no m2e connector has been installed before click on the Find moew SCM connectors in the m2e Marketplace link on the wizard's page. Select the *m2e-egit* connector plugin and install it.

Select git fror the drop down selection which is part of the *SCM URL* labeled field and paste the following address https://github.com/Adabaskar/jsf-play.git into the field. Got to the next wizard page named Select Project Location and change the *Location:* away from the default workspace, this will make the management of project relevant files easier. For example use SOME_PROJECTS_FOLDER/jsfPlay/git . Checkout the project, it should be automatically be configured by the m2e plugin.

## Add resources to the application server in Eclipse
After cloning the project like described above, add the resulting war package to the previously configured server. This can be achieved via the Servers view in eclipse. Find the corresponding server handle and right click &gt; Add and Remove ... Add the the project from the *Available:* list, so that it is displayed in th *Configured:* list. Close the wizard and start the server (see above).

## Check availablity and start playing
You should be able to reach a jsf website via http://localhost:8080/jsf-play-war/index.xhtml or http://localhost:8080/jsf-play-war/indexPF.xhtml

There are currently four files one can play around with:
* src/main/webapp/index.xhtml
* src/main/webapp/indexPF.xhtml
* src/main/java/de/adabaskar/play/jsf/viewmodel/EntryPageViewModel.java
* src/main/java/de/adabaskar/play/domainfake/BusinessServiceDummy.java
















