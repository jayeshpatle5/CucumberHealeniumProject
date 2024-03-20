cd D:\eclipse workspace\healenium\grid
start cmd /k "call javastandalone.bat"
cd D:\MyProjects\EclipseWorkspace\cucumberproject
timeout /t 20
cmd /k mvn clean verify