package helper;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import abstractions.Source;
import downloaders.DownloaderFactory;

public enum Ever {
	object;
	
	
	ExecutorService executor;//Set this up
	
	DownloaderFactory dlFactory;
	
	public boolean downloadFiles(Collection<Source> sources) {
		Map<Source, Future<Boolean>> status = new HashMap<>();
		for(Source source:sources) {
			Future<Boolean> future = executor.submit(new Callable<Boolean>() {
				@Override
				public Boolean call() throws Exception {
					return dlFactory.getInstance(source.protocol).downloadToDisk(source.url, source.dlFilename);
				}
			});
			status.put(source, future);
		}
		
		//Use that map - get teh futures- if status false then 
		return false;
	}
}
