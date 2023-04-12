# Fabric-Quilt Multiproject Template

If you want to make a mod that is compatible with both Fabric and Quilt, you should just write a Fabric mod. Most people do not need this template. However, for those who, by want or neccesity, must travel the seas of Quilt, but are still unwavering in their insistence to stick to Fabric compatability, this template begrudingly has your back. 

This project template is an opinionated way for a **Fabric mod to provide Quilt-specific extensions**, like adding compatability with Quilt-only mods or writing Quilt-specific hacks for those sailing the dangerous waters of modloader internals. This template uses an approach that is unlikely to break over time, and should easily be adapted to new Loom versions or even Quilt Gradle (for the Quilt-specific code).

Since our official stance is that if you want to benefit from Quilt-specific APIs, you should just write a Quilt mod, you will find few friends along your path. This template will not be kept up to date unless absolutely neccesary; it will only be updated when something breaks with a non-obvious solution.
While neither modloader is hostile to mods written for both Fabric and Quilt, it's not an intended use-case on either project's tooling. We will make an effort to keep it possible, but it is not a priority, and things might break at any time and you may be forced to use an entirely different approach.

**You should probably just pick one mod loader.**

---

# Using this template
