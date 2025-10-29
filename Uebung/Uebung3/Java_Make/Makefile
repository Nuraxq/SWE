BIN_DIR = bin
JC = javac
SRC = src/A.java src/B.java src/Main.java
CLASSES = A.class B.class Main.class
JAVA = java

#Wir geben die Version aus und lassen dann das Programm laufen. 
all: version run

run:$(BIN_DIR)
#Wir compilieren in den Bin ordner
	$(JC) -d $(BIN_DIR) $(SRC) 
#Dann führen wir die Main datei aus
	$(JAVA) -cp $(BIN_DIR) Main

clean: 
# Verzeichnis Löschen, /S löscht untervezeichnisse /Q sorgt dafür dass nicht bestätigt werden muss
	rmdir /S /Q $(BIN_DIR)


$(BIN_DIR):
#Falls das Verzeichnis nicht da ist machen wir es neu
	mkdir $(BIN_DIR)


version: 
	@echo "Aktuelle Java Version: " 
	$(JAVA) --version