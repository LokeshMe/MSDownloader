package main;

import java.util.Collection;

import abstractions.Source;
import helper.Ever;
import sources.SourcesProvider;

public class Main {

	String configurableLocation;
	
	//Services used
	private Ever ever=Ever.object;
	SourcesProvider sp=new SourcesProvider();
	
	void downloadFromMultipleSources() {
		
		Collection<Source> sources = sp.getSources();
		boolean status=ever.downloadFiles(sources);
		/*
		 * Things to take care of
		 * 1. Partial Dl- in the dl method: resume or remove?
		 * 2. Big Sources- part
		 * 3. Diff Speed
		 */
		exit();//countdown latch
	}


	private void exit() {
		// TODO Auto-generated method stub
		
	}
}
