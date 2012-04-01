package pl.bedkowski.projekty.seam3;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

public class WidgetListProducer
{
   @Inject EntityManager entityManager;

   @Produces
   @Named
   @RequestScoped
   @SuppressWarnings("unchecked")
   List<Widget> getWidgets() {
      return entityManager.createQuery("select w from Widget w order by w.name").getResultList();
   }
}
