package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class F1 extends ContentObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F1(int i, Object obj) {
        super(null);
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 1:
                return true;
            case 2:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                onChange(z, null);
                return;
            case 1:
                ViewOnClickListenerC5823m61 viewOnClickListenerC5823m61 = (ViewOnClickListenerC5823m61) this.b;
                if (!viewOnClickListenerC5823m61.b || (cursor = viewOnClickListenerC5823m61.c) == null || cursor.isClosed()) {
                    return;
                }
                viewOnClickListenerC5823m61.a = viewOnClickListenerC5823m61.c.requery();
                return;
            case 2:
                DB db = (DB) this.b;
                if (db.c) {
                    db.f();
                    return;
                } else {
                    db.f = true;
                    return;
                }
            case 3:
                ((AtomicBoolean) ((C2541ca) this.b).b).set(true);
                return;
            default:
                C8162yN1 c8162yN1 = (C8162yN1) this.b;
                synchronized (c8162yN1.e) {
                    c8162yN1.f = null;
                    c8162yN1.c.run();
                }
                synchronized (c8162yN1) {
                    try {
                        Iterator it = c8162yN1.g.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(AccessibilityInfoModule accessibilityInfoModule, Handler handler) {
        super(handler);
        this.a = 0;
        this.b = accessibilityInfoModule;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(DB db) {
        super(new Handler());
        this.a = 2;
        this.b = db;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(ViewOnClickListenerC5823m61 viewOnClickListenerC5823m61) {
        super(new Handler());
        this.a = 1;
        this.b = viewOnClickListenerC5823m61;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.a) {
            case 0:
                AccessibilityInfoModule accessibilityInfoModule = (AccessibilityInfoModule) this.b;
                if (accessibilityInfoModule.getReactApplicationContext().hasActiveReactInstance()) {
                    accessibilityInfoModule.updateAndSendReduceMotionChangeEvent();
                    break;
                }
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }
}
