package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import p000.BP0;
import p000.RQ1;

@Metadata(m22266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m22267d2 = {"Lio/appmetrica/analytics/coreutils/internal/toggle/ConjunctiveCompositeThreadSafeToggle;", "Lio/appmetrica/analytics/coreapi/internal/control/Toggle;", "", "toggles", "", "tagPostfix", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Lio/appmetrica/analytics/coreapi/internal/control/ToggleObserver;", "toggleObserver", "", "sticky", "LTf1;", "registerObserver", "(Lio/appmetrica/analytics/coreapi/internal/control/ToggleObserver;Z)V", "removeObserver", "(Lio/appmetrica/analytics/coreapi/internal/control/ToggleObserver;)V", "toString", "()Ljava/lang/String;", "e", "Z", "getActualState", "()Z", "setActualState", "(Z)V", "actualState", "core-utils_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class ConjunctiveCompositeThreadSafeToggle implements Toggle {

    /* renamed from: c */
    private final String f29767c;

    /* renamed from: e, reason: from kotlin metadata */
    private volatile boolean actualState;

    /* renamed from: a */
    private final ArrayList f29765a = new ArrayList();

    /* renamed from: b */
    private final HashMap f29766b = new HashMap();

    /* renamed from: d */
    private final ReentrantLock f29768d = new ReentrantLock();

    public ConjunctiveCompositeThreadSafeToggle(List<? extends Toggle> list, String str) {
        this.f29767c = "[ConjunctiveCompositeToggle-" + str + ']';
        try {
            access$acquireLock(this);
            for (final Toggle toggle : list) {
                ToggleObserver toggleObserver = new ToggleObserver() { // from class: io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle$1$1$observer$1
                    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
                    public void onStateChanged(boolean incomingState) {
                        ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle = this.f29770a;
                        Toggle toggle2 = toggle;
                        try {
                            ConjunctiveCompositeThreadSafeToggle.access$acquireLock(conjunctiveCompositeThreadSafeToggle);
                            ConjunctiveCompositeThreadSafeToggle.access$updateState(conjunctiveCompositeThreadSafeToggle, this, incomingState, String.valueOf(BP0.f799a.mo3846b(toggle2.getClass()).mo2808f()));
                        } finally {
                            ConjunctiveCompositeThreadSafeToggle.access$releaseLock(conjunctiveCompositeThreadSafeToggle);
                        }
                    }
                };
                this.f29766b.put(toggleObserver, Boolean.valueOf(toggle.getActualState()));
                toggle.registerObserver(toggleObserver, false);
            }
            setActualState(m19169a(this.f29766b.values()));
            access$releaseLock(this);
        } catch (Throwable th) {
            access$releaseLock(this);
            throw th;
        }
    }

    /* renamed from: a */
    private static boolean m19169a(Collection collection) {
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final void access$acquireLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.getClass();
        boolean zTryLock = false;
        while (!zTryLock) {
            try {
                zTryLock = conjunctiveCompositeThreadSafeToggle.f29768d.tryLock(100L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                RQ1.m7015b(th);
            }
            if (!zTryLock) {
                try {
                    Thread.sleep(100L);
                } catch (Throwable th2) {
                    RQ1.m7015b(th2);
                }
            }
        }
    }

    public static final void access$releaseLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.f29768d.unlock();
    }

    public static final void access$updateState(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle, ToggleObserver toggleObserver, boolean z, String str) {
        conjunctiveCompositeThreadSafeToggle.f29766b.put(toggleObserver, Boolean.valueOf(z));
        boolean zM19169a = m19169a(conjunctiveCompositeThreadSafeToggle.f29766b.values());
        if (zM19169a != conjunctiveCompositeThreadSafeToggle.getActualState()) {
            conjunctiveCompositeThreadSafeToggle.setActualState(zM19169a);
            Iterator it = conjunctiveCompositeThreadSafeToggle.f29765a.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(zM19169a);
            }
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public boolean getActualState() {
        return this.actualState;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void registerObserver(ToggleObserver toggleObserver, boolean sticky) {
        try {
            access$acquireLock(this);
            this.f29765a.add(toggleObserver);
            if (sticky) {
                toggleObserver.onStateChanged(getActualState());
            }
        } finally {
            access$releaseLock(this);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void removeObserver(ToggleObserver toggleObserver) {
        try {
            access$acquireLock(this);
            this.f29765a.remove(toggleObserver);
        } finally {
            access$releaseLock(this);
        }
    }

    public void setActualState(boolean z) {
        this.actualState = z;
    }

    public String toString() {
        return "ConjunctiveCompositeThreadSafeToggle(toggleStates=" + this.f29766b + ", tag='" + this.f29767c + "', actualState=" + getActualState() + ')';
    }
}
