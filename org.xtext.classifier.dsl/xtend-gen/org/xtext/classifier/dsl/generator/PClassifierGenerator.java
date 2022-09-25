/**
 * generated by Xtext 2.26.0
 */
package org.xtext.classifier.dsl.generator;

import com.google.common.collect.Iterators;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.classifier.dsl.pClassifier.Classifier;

@SuppressWarnings("all")
public class PClassifierGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Function1<Classifier, String> _function = (Classifier it) -> {
      return it.getName();
    };
    fsa.generateFile("test.py", 
      IteratorExtensions.join(IteratorExtensions.<Classifier, String>map(Iterators.<Classifier>filter(resource.getAllContents(), Classifier.class), _function), ", "));
  }
}
