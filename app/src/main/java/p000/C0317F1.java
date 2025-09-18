package p000;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: F1 */
/* loaded from: classes.dex */
public final class C0317F1 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ int f3012a;

    /* renamed from: b */
    public final /* synthetic */ Object f3013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0317F1(int i, Object obj) {
        super(null);
        this.f3012a = i;
        this.f3013b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f3012a) {
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
        switch (this.f3012a) {
            case 0:
                onChange(z, null);
                return;
            case 1:
                ViewOnClickListenerC10224m61 viewOnClickListenerC10224m61 = (ViewOnClickListenerC10224m61) this.f3013b;
                if (!viewOnClickListenerC10224m61.f616b || (cursor = viewOnClickListenerC10224m61.f617c) == null || cursor.isClosed()) {
                    return;
                }
                viewOnClickListenerC10224m61.f615a = viewOnClickListenerC10224m61.f617c.requery();
                return;
            case 2:
                C0201DB c0201db = (C0201DB) this.f3013b;
                if (c0201db.f41358c) {
                    c0201db.m24165f();
                    return;
                } else {
                    c0201db.f41361f = true;
                    return;
                }
            case 3:
                ((AtomicBoolean) ((C1856ca) this.f3013b).f17605b).set(true);
                return;
            default:
                C11791yN1 c11791yN1 = (C11791yN1) this.f3013b;
                synchronized (c11791yN1.f46245e) {
                    c11791yN1.f46246f = null;
                    c11791yN1.f46243c.run();
                }
                synchronized (c11791yN1) {
                    try {
                        Iterator it = c11791yN1.f46247g.iterator();
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
    public C0317F1(AccessibilityInfoModule accessibilityInfoModule, Handler handler) {
        super(handler);
        this.f3012a = 0;
        this.f3013b = accessibilityInfoModule;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0317F1(C0201DB c0201db) {
        super(new Handler());
        this.f3012a = 2;
        this.f3013b = c0201db;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0317F1(ViewOnClickListenerC10224m61 viewOnClickListenerC10224m61) {
        super(new Handler());
        this.f3012a = 1;
        this.f3013b = viewOnClickListenerC10224m61;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.f3012a) {
            case 0:
                AccessibilityInfoModule accessibilityInfoModule = (AccessibilityInfoModule) this.f3013b;
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
