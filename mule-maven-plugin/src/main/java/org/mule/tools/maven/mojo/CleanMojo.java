/*
 * Mule ESB Maven Tools
 * <p>
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * <p>
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.tools.maven.mojo;

import java.io.IOException;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

import org.mule.tools.api.packager.sources.MuleContentGenerator;

/**
 * @author Mulesoft Inc.
 * @since 3.1.0
 */
@Mojo(name = "clean",
    defaultPhase = LifecyclePhase.CLEAN,
    requiresDependencyResolution = ResolutionScope.RUNTIME)
public class CleanMojo extends AbstractMuleMojo {

  @Override
  public void doExecute() throws MojoExecutionException, MojoFailureException {}

  @Override
  public String getPreviousRunPlaceholder() {
    return "MULE_MAVEN_PLUGIN_CLEAN_PREVIOUS_RUN_PLACEHOLDER";
  }
}
