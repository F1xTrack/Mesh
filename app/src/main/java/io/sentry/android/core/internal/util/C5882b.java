package io.sentry.android.core.internal.util;

import android.os.Looper;
import io.sentry.util.thread.InterfaceC6176a;

/* renamed from: io.sentry.android.core.internal.util.b */
/* loaded from: classes2.dex */
public final class C5882b implements InterfaceC6176a {

    /* renamed from: a */
    public static final C5882b f33750a = new C5882b();

    /* renamed from: b */
    public static final C5882b f33751b = new C5882b();

    @Override // io.sentry.util.thread.InterfaceC6176a
    /* renamed from: a */
    public boolean mo21581a() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }
}
