package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m22266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m22267d2 = {"Lio/appmetrica/analytics/coreutils/internal/toggle/SimpleThreadSafeToggle;", "Lio/appmetrica/analytics/coreapi/internal/control/Toggle;", "", "initialState", "", "tag", "<init>", "(ZLjava/lang/String;)V", "Lio/appmetrica/analytics/coreapi/internal/control/ToggleObserver;", "toggleObserver", "sticky", "LTf1;", "registerObserver", "(Lio/appmetrica/analytics/coreapi/internal/control/ToggleObserver;Z)V", "removeObserver", "(Lio/appmetrica/analytics/coreapi/internal/control/ToggleObserver;)V", "value", "updateState", "(Z)V", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "getActualState", "()Z", "actualState", "core-utils_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public abstract class SimpleThreadSafeToggle implements Toggle {

    /* renamed from: a, reason: from kotlin metadata */
    private final String tag;

    /* renamed from: b */
    private boolean f29773b;

    /* renamed from: c */
    private final ArrayList f29774c;

    public SimpleThreadSafeToggle(boolean z, String str) {
        this.tag = str;
        this.f29773b = z;
        this.f29774c = new ArrayList();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized boolean getActualState() {
        return this.f29773b;
    }

    public final String getTag() {
        return this.tag;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void registerObserver(ToggleObserver toggleObserver, boolean sticky) {
        this.f29774c.add(toggleObserver);
        if (sticky) {
            toggleObserver.onStateChanged(getActualState());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void removeObserver(ToggleObserver toggleObserver) {
        this.f29774c.remove(toggleObserver);
    }

    public final synchronized void updateState(boolean value) {
        if (value != getActualState()) {
            this.f29773b = value;
            Iterator it = this.f29774c.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(value);
            }
        }
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str);
    }
}
