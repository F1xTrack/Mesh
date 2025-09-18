package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4622ic extends C5033zh implements Fa {
    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void b(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void c() {
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final List<String> g() {
        return new ArrayList();
    }

    @Override // io.appmetrica.analytics.impl.C5033zh, io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
    }

    @Override // io.appmetrica.analytics.impl.C5033zh, io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.Fa, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void b(String str) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(AnrListener anrListener) {
    }

    @Override // io.appmetrica.analytics.impl.Fa, io.appmetrica.analytics.impl.Aa
    public final void b(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(ExternalAttribution externalAttribution) {
    }

    @Override // io.appmetrica.analytics.impl.Fa, io.appmetrica.analytics.impl.Aa
    public final boolean b() {
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(Cn cn) {
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(EnumC4752o enumC4752o) {
    }

    @Override // io.appmetrica.analytics.impl.Fa, io.appmetrica.analytics.impl.Aa
    public final void a(String str) {
    }

    @Override // io.appmetrica.analytics.impl.Fa, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(String str, boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.Fa, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void a(boolean z) {
    }
}
