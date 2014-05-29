package databook;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import databook.listener.Indexer;
import databook.listener.service.IndexingService;
import databook.local.model.RDFDatabase;

public class Activator implements BundleActivator {
	ServiceRegistration sr;
	ServiceRegistration inxSvc;
	Indexer i;
	RDFDatabase database;
	IndexingService ts;

	@Override
	public void start(BundleContext context) throws Exception {
		/*
		 * ModelUpdater s = new ModelUpdater(); if(sr == null) { sr =
		 * context.registerService(MessageHandler.class, s, null); } if(inxSvc
		 * == null) { inxSvc = context.registerService(IndexingService.class, s,
		 * null); }
		 */
		System.out.println("indexing framework started");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		/*
		 * if(sr != null) { sr.unregister(); sr = null; }
		 * 
		 * if(inxSvc != null) { inxSvc.unregister(); inxSvc = null; }
		 */

		System.out.println("indexing framework stopped");

	}

}
