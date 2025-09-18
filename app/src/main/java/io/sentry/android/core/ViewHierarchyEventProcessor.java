package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.C5765F1;
import io.sentry.C5825a;
import io.sentry.C6039i1;
import io.sentry.C6193y;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC6165u;
import io.sentry.android.core.internal.util.C5884d;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6078A;
import io.sentry.protocol.C6083F;
import io.sentry.protocol.C6084G;
import io.sentry.util.thread.InterfaceC6176a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC7222ym;
import p000.RunnableC0141CE;

/* loaded from: classes2.dex */
public final class ViewHierarchyEventProcessor implements InterfaceC6165u {

    /* renamed from: a */
    public final SentryAndroidOptions f33629a;

    /* renamed from: b */
    public final C5884d f33630b;

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f33629a = sentryAndroidOptions;
        this.f33630b = new C5884d(2000L, 3);
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            AbstractC6003a.m21742a("ViewHierarchy");
        }
    }

    /* renamed from: b */
    public static void m21551b(View view, C6084G c6084g, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw AbstractC7222ym.m26227d(it);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    C6084G c6084gM21553f = m21553f(childAt);
                    arrayList.add(c6084gM21553f);
                    m21551b(childAt, c6084gM21553f, list);
                }
            }
            c6084g.f34310k = arrayList;
        }
    }

    /* renamed from: d */
    public static C6083F m21552d(Activity activity, List list, InterfaceC6176a interfaceC6176a, ILogger iLogger) {
        if (activity == null) {
            iLogger.mo21407k(EnumC6069n1.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.mo21407k(EnumC6069n1.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.mo21407k(EnumC6069n1.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
        } catch (Throwable th) {
            iLogger.mo21406d(EnumC6069n1.ERROR, "Failed to process view hierarchy.", th);
        }
        if (interfaceC6176a.mo21581a()) {
            ArrayList arrayList = new ArrayList(1);
            C6083F c6083f = new C6083F("android_view_system", arrayList);
            C6084G c6084gM21553f = m21553f(viewPeekDecorView);
            arrayList.add(c6084gM21553f);
            m21551b(viewPeekDecorView, c6084gM21553f, list);
            return c6083f;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference(null);
        activity.runOnUiThread(new RunnableC0141CE(atomicReference, viewPeekDecorView, list, countDownLatch, iLogger, 4));
        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
            return (C6083F) atomicReference.get();
        }
        return null;
    }

    /* renamed from: f */
    public static C6084G m21553f(View view) {
        C6084G c6084g = new C6084G();
        c6084g.f34301b = AbstractC6003a.m21751j(view);
        try {
            c6084g.f34302c = AbstractC6003a.m21757p(view);
        } catch (Throwable unused) {
        }
        c6084g.f34306g = Double.valueOf(view.getX());
        c6084g.f34307h = Double.valueOf(view.getY());
        c6084g.f34304e = Double.valueOf(view.getWidth());
        c6084g.f34305f = Double.valueOf(view.getHeight());
        c6084g.f34309j = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            c6084g.f34308i = "visible";
        } else if (visibility == 4) {
            c6084g.f34308i = "invisible";
        } else if (visibility == 8) {
            c6084g.f34308i = "gone";
        }
        return c6084g;
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: a */
    public final C5765F1 mo21517a(C5765F1 c5765f1, C6193y c6193y) {
        return c5765f1;
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: c */
    public final C6039i1 mo21519c(C6039i1 c6039i1, C6193y c6193y) {
        if (!c6039i1.m21788c()) {
            return c6039i1;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f33629a;
        if (!sentryAndroidOptions.isAttachViewHierarchy()) {
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
            return c6039i1;
        }
        if (AbstractC6003a.m21763w(c6193y)) {
            return c6039i1;
        }
        boolean zM21583a = this.f33630b.m21583a();
        sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
        if (zM21583a) {
            return c6039i1;
        }
        WeakReference weakReference = (WeakReference) C5832D.f33521b.f33522a;
        C6083F c6083fM21552d = m21552d(weakReference != null ? (Activity) weakReference.get() : null, sentryAndroidOptions.getViewHierarchyExporters(), sentryAndroidOptions.getMainThreadChecker(), sentryAndroidOptions.getLogger());
        if (c6083fM21552d != null) {
            c6193y.f34742d = new C5825a(c6083fM21552d);
        }
        return c6039i1;
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: e */
    public final C6078A mo21521e(C6078A c6078a, C6193y c6193y) {
        return c6078a;
    }
}
