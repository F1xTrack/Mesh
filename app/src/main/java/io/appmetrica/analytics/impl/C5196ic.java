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

/* renamed from: io.appmetrica.analytics.impl.ic */
/* loaded from: classes2.dex */
public final class C5196ic extends C5626zh implements InterfaceC4491Fa {
    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: a */
    public final void mo19402a(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: b */
    public final void mo19408b(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: c */
    public final void mo19410c() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: g */
    public final List<String> mo19411g() {
        return new ArrayList();
    }

    @Override // io.appmetrica.analytics.impl.C5626zh, io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
    }

    @Override // io.appmetrica.analytics.impl.C5626zh, io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa, io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19312a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: b */
    public final void mo19409b(String str) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: a */
    public final void mo19403a(AnrListener anrListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa, io.appmetrica.analytics.impl.InterfaceC4367Aa
    /* renamed from: b */
    public final void mo19187b(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: a */
    public final void mo19404a(ExternalAttribution externalAttribution) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa, io.appmetrica.analytics.impl.InterfaceC4367Aa
    /* renamed from: b */
    public final boolean mo19188b() {
        return false;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: a */
    public final void mo19405a(C4430Cn c4430Cn) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: a */
    public final void mo19406a(EnumC5333o enumC5333o) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa, io.appmetrica.analytics.impl.InterfaceC4367Aa
    /* renamed from: a */
    public final void mo19186a(String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa, io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19314a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa
    /* renamed from: a */
    public final void mo19407a(String str, boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4491Fa, io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19315a(boolean z) {
    }
}
