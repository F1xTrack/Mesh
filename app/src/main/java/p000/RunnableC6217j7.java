package p000;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mrousavy.camera.react.CameraViewModule;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j7 */
/* loaded from: classes.dex */
public final class RunnableC6217j7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f34926a;

    /* renamed from: b */
    public final int f34927b;

    /* renamed from: c */
    public final Object f34928c;

    /* renamed from: d */
    public final Object f34929d;

    public RunnableC6217j7(C0619Jp c0619Jp, int i, CameraViewModule cameraViewModule) {
        this.f34926a = 2;
        this.f34928c = c0619Jp;
        this.f34927b = i;
        this.f34929d = cameraViewModule;
    }

    @Override // java.lang.Runnable
    public final void run() throws C10233mB0 {
        C0300El c0300El;
        ArrayList arrayList;
        int iDecrementAndGet;
        switch (this.f34926a) {
            case 0:
                ((TextView) this.f34928c).setTypeface((Typeface) this.f34929d, this.f34927b);
                return;
            case 1:
                ((BottomSheetBehavior) this.f34929d).m11200J(this.f34927b, (View) this.f34928c, false);
                return;
            case 2:
                C0619Jp c0619Jp = (C0619Jp) this.f34928c;
                if (c0619Jp.m4443w()) {
                    throw new CancellationException();
                }
                ReactApplicationContext reactApplicationContext = ((CameraViewModule) this.f34929d).getReactApplicationContext();
                if (reactApplicationContext == null) {
                    throw new Error("React Context was null!");
                }
                UIManager uIManagerM6095f = OZ1.m6095f(reactApplicationContext, 1, true);
                if (uIManagerM6095f == null) {
                    throw new Error("UIManager not found!");
                }
                int i = this.f34927b;
                View viewResolveView = uIManagerM6095f.resolveView(i);
                C4140gp c4140gp = viewResolveView instanceof C4140gp ? (C4140gp) viewResolveView : null;
                if (c4140gp == null) {
                    throw new C10233mB0(i);
                }
                c0619Jp.resumeWith(c4140gp);
                return;
            case 3:
                int i2 = this.f34927b;
                InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = (InterfaceFutureC7800Jj0) this.f34928c;
                C11834yj0 c11834yj0 = (C11834yj0) this.f34929d;
                AtomicInteger atomicInteger = c11834yj0.f46429d;
                ArrayList arrayList2 = c11834yj0.f46427b;
                boolean zIsDone = c11834yj0.isDone();
                boolean z = c11834yj0.f46428c;
                if (zIsDone || arrayList2 == null) {
                    AbstractC9104dM1.m17550i(z, "Future was done before all dependencies completed");
                    return;
                }
                try {
                    try {
                        try {
                            try {
                                AbstractC9104dM1.m17550i(interfaceFutureC7800Jj0.isDone(), "Tried to set value from future which is not done");
                                arrayList2.set(i2, AbstractC8301Sz1.m7483f(interfaceFutureC7800Jj0));
                                iDecrementAndGet = atomicInteger.decrementAndGet();
                                AbstractC9104dM1.m17550i(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                            } catch (Error e) {
                                c11834yj0.f46431f.m2377d(e);
                                int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                                AbstractC9104dM1.m17550i(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                                if (iDecrementAndGet2 != 0) {
                                    return;
                                }
                                ArrayList arrayList3 = c11834yj0.f46427b;
                                if (arrayList3 != null) {
                                    c0300El = c11834yj0.f46431f;
                                    arrayList = new ArrayList(arrayList3);
                                }
                            } catch (RuntimeException e2) {
                                if (z) {
                                    c11834yj0.f46431f.m2377d(e2);
                                }
                                int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                                AbstractC9104dM1.m17550i(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                                if (iDecrementAndGet3 != 0) {
                                    return;
                                }
                                ArrayList arrayList4 = c11834yj0.f46427b;
                                if (arrayList4 != null) {
                                    c0300El = c11834yj0.f46431f;
                                    arrayList = new ArrayList(arrayList4);
                                }
                            }
                        } catch (CancellationException unused) {
                            if (z) {
                                c11834yj0.cancel(false);
                            }
                            int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                            AbstractC9104dM1.m17550i(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet4 != 0) {
                                return;
                            }
                            ArrayList arrayList5 = c11834yj0.f46427b;
                            if (arrayList5 != null) {
                                c0300El = c11834yj0.f46431f;
                                arrayList = new ArrayList(arrayList5);
                            }
                        }
                    } catch (ExecutionException e3) {
                        if (z) {
                            c11834yj0.f46431f.m2377d(e3.getCause());
                        }
                        int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                        AbstractC9104dM1.m17550i(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet5 != 0) {
                            return;
                        }
                        ArrayList arrayList6 = c11834yj0.f46427b;
                        if (arrayList6 != null) {
                            c0300El = c11834yj0.f46431f;
                            arrayList = new ArrayList(arrayList6);
                        }
                    }
                    if (iDecrementAndGet == 0) {
                        ArrayList arrayList7 = c11834yj0.f46427b;
                        if (arrayList7 != null) {
                            c0300El = c11834yj0.f46431f;
                            arrayList = new ArrayList(arrayList7);
                            c0300El.m2375b(arrayList);
                            return;
                        }
                        AbstractC9104dM1.m17550i(c11834yj0.isDone(), null);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    AbstractC9104dM1.m17550i(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet6 == 0) {
                        ArrayList arrayList8 = c11834yj0.f46427b;
                        if (arrayList8 != null) {
                            c11834yj0.f46431f.m2375b(new ArrayList(arrayList8));
                        } else {
                            AbstractC9104dM1.m17550i(c11834yj0.isDone(), null);
                        }
                    }
                    throw th;
                }
            case 4:
                ((L71) this.f34928c).m4903b(this.f34927b, (Intent) this.f34929d);
                return;
            default:
                ((SystemForegroundService) this.f34929d).f16594e.notify(this.f34927b, (Notification) this.f34928c);
                return;
        }
    }

    public /* synthetic */ RunnableC6217j7(Object obj, int i, Object obj2, int i2) {
        this.f34926a = i2;
        this.f34929d = obj;
        this.f34927b = i;
        this.f34928c = obj2;
    }

    public /* synthetic */ RunnableC6217j7(Object obj, Object obj2, int i, int i2) {
        this.f34926a = i2;
        this.f34928c = obj;
        this.f34929d = obj2;
        this.f34927b = i;
    }

    public RunnableC6217j7(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f34926a = 1;
        this.f34929d = bottomSheetBehavior;
        this.f34928c = view;
        this.f34927b = i;
    }
}
