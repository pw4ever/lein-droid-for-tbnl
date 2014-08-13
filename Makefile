.PHONY: all doc build push

DOC:=docs/uberdoc.html
SRC:=$(shell find src -type f) project.clj

all: doc

doc: $(DOC)
	git checkout gh-pages
	cp $(DOC) index.html
	-git add index.html
	-git commit -a -m 'update doc'
	git checkout master

$(DOC): $(SRC)
	lein do marg, pom

build:
	lein do marg, pom

push:
	-git checkout gh-pages; git push
	-git checkout master; git push
