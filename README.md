# Fabric-Quilt Multiproject Template

If you want to make a mod that is compatible with both Fabric and Quilt, you should just write a Fabric mod.
Most people do not need this template. However, for those who must travel the seas of Quilt, but are still unwavering 
in their insistence to stick to Fabric compatability, this template begrudgingly has your back.

Since our official stance is that if you want to benefit from Quilt-specific APIs, you should just write a Quilt mod, you will find few friends along your path.
Once complete, this template will not be kept up to date unless absolutely necessary;
it will only be updated when something breaks with a non-obvious solution.

While neither modloader is hostile to mods written for both Fabric and Quilt,
it's not an intended use-case on either project's tooling. Quilt will make an effort to keep it possible, 
but it is not a priority. Things might break at any time and you may be forced to use an entirely different approach.

**You should probably just pick one mod loader.**

---

# About this template
This project template is an opinionated way for a **Fabric mod to provide Quilt-specific extensions**,
like adding compatability with Quilt-only mods or, for those sailing the dangerous waters of modloader internals and incompatibilities, writing Quilt-specific hacks.

It is structured as three completely separate projects:
1. The `fabric` project, holding the Fabric mod where the majority of your code goes.
2. The `quilt` project, holding the **different** Quilt mod where your specific compatibility code goes.
3. The root project, where the `quilt` mod is added as a jar-in-jar to the fabric project, and all publication is handled.

Note that the `fabric` and `quilt` projects are NOT subprojects in the traditional sense; they each have their own
`settings.gradle` and are only used together with `includeBuild`. Each project is fully isolated from the other, preventing
classpath or setting pollution from either Quilt or Fabric tooling.

# Who this project is for
TODO. tl;dr anyone who needs a significant amount of quilt-specific code, but for whom reflection isnt an option

# Design motivations
TODO.
tl;dr: this is a setup that is pretty much guaranteed to never break. it doesn't use anything which could ever cause problems
like having both a QMJ and FMJ, mixing quilt + fabric loom, etc. while it comes with its own complexity, you never need to
worry about future versions introducing bugs/incompatibilities/incomplete features which break your mod

# Future considerations
- Convention plugin/similar for common gradle code
- Move publication back to the `quilt` and `fabric` projects, create a task in the root project to call each publish task
