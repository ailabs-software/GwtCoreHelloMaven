# GwtCoreHelloMaven
Inherits User

mvn compile
mvn package 


your gwtcorehellomaven.nocache.js shouldnt be in src/main/webapp anyway, it will be in target/projectname-version/gwtcorehellomaven

[15:22] <niloc132> short version, rather than ant/make's arbitrary "graph of targets" mechanism
[15:23] <niloc132> it has just a fixed set of about two dozen phases
[15:23] == voidDotClass [~ali@103.255.4.93] has quit [Read error: Connection reset by peer]
[15:23] <niloc132> order is fixed between them
[15:23] <niloc132> and goals (features of plugins) can be bound to phases, either by default or by you declaring them in the pom.xml

[15:25] <niloc132> maven operates on "convention over configuration", meaning rather than every project writing build scripts that compile sources from one path and to another, and each has to define their own, maven makes assumptions about what goes where, and all plugins keep those assumptions in mind
[15:25] <niloc132> src/ contains, obviously, sources, target/ is the compiled output (including compiled js from gwt)

