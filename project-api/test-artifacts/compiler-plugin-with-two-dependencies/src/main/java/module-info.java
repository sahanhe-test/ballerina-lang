module compiler.plugin.test.plugin.with.two.dependencies {
    requires io.ballerina.lang;
    requires io.ballerina.parser;
    requires io.ballerina.tools.api;
    requires compiler.plugin.test.diagnostic.utils.lib;
    requires compiler.plugin.test.string.utils.lib;

    exports io.samjs.plugins.twodependencies;
}
