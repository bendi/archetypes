package pl.bedkowski.projekty.seam3;

import javax.enterprise.context.ConversationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.jboss.solder.core.ExtensionManaged;

public class MyEmProducer {
	@ExtensionManaged
	@PersistenceUnit(unitName="widgets")
	@ConversationScoped
	@Produces
	EntityManagerFactory em;
}
