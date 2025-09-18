package defpackage;

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

/* renamed from: j7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5251j7 implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Object d;

    public RunnableC5251j7(C0767Jp c0767Jp, int i, CameraViewModule cameraViewModule) {
        this.a = 2;
        this.c = c0767Jp;
        this.b = i;
        this.d = cameraViewModule;
    }

    @Override // java.lang.Runnable
    public final void run() throws C5837mB0 {
        C0365El c0365El;
        ArrayList arrayList;
        int iDecrementAndGet;
        switch (this.a) {
            case 0:
                ((TextView) this.c).setTypeface((Typeface) this.d, this.b);
                return;
            case 1:
                ((BottomSheetBehavior) this.d).J(this.b, (View) this.c, false);
                return;
            case 2:
                C0767Jp c0767Jp = (C0767Jp) this.c;
                if (c0767Jp.w()) {
                    throw new CancellationException();
                }
                ReactApplicationContext reactApplicationContext = ((CameraViewModule) this.d).getReactApplicationContext();
                if (reactApplicationContext == null) {
                    throw new Error("React Context was null!");
                }
                UIManager uIManagerF = OZ1.f(reactApplicationContext, 1, true);
                if (uIManagerF == null) {
                    throw new Error("UIManager not found!");
                }
                int i = this.b;
                View viewResolveView = uIManagerF.resolveView(i);
                C4034gp c4034gp = viewResolveView instanceof C4034gp ? (C4034gp) viewResolveView : null;
                if (c4034gp == null) {
                    throw new C5837mB0(i);
                }
                c0767Jp.resumeWith(c4034gp);
                return;
            case 3:
                int i2 = this.b;
                InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = (InterfaceFutureC0750Jj0) this.c;
                C8227yj0 c8227yj0 = (C8227yj0) this.d;
                AtomicInteger atomicInteger = c8227yj0.d;
                ArrayList arrayList2 = c8227yj0.b;
                boolean zIsDone = c8227yj0.isDone();
                boolean z = c8227yj0.c;
                if (zIsDone || arrayList2 == null) {
                    AbstractC3377dM1.i(z, "Future was done before all dependencies completed");
                    return;
                }
                try {
                    try {
                        try {
                            try {
                                AbstractC3377dM1.i(interfaceFutureC0750Jj0.isDone(), "Tried to set value from future which is not done");
                                arrayList2.set(i2, AbstractC1500Sz1.f(interfaceFutureC0750Jj0));
                                iDecrementAndGet = atomicInteger.decrementAndGet();
                                AbstractC3377dM1.i(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                            } catch (Error e) {
                                c8227yj0.f.d(e);
                                int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                                AbstractC3377dM1.i(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                                if (iDecrementAndGet2 != 0) {
                                    return;
                                }
                                ArrayList arrayList3 = c8227yj0.b;
                                if (arrayList3 != null) {
                                    c0365El = c8227yj0.f;
                                    arrayList = new ArrayList(arrayList3);
                                }
                            } catch (RuntimeException e2) {
                                if (z) {
                                    c8227yj0.f.d(e2);
                                }
                                int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                                AbstractC3377dM1.i(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                                if (iDecrementAndGet3 != 0) {
                                    return;
                                }
                                ArrayList arrayList4 = c8227yj0.b;
                                if (arrayList4 != null) {
                                    c0365El = c8227yj0.f;
                                    arrayList = new ArrayList(arrayList4);
                                }
                            }
                        } catch (CancellationException unused) {
                            if (z) {
                                c8227yj0.cancel(false);
                            }
                            int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                            AbstractC3377dM1.i(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet4 != 0) {
                                return;
                            }
                            ArrayList arrayList5 = c8227yj0.b;
                            if (arrayList5 != null) {
                                c0365El = c8227yj0.f;
                                arrayList = new ArrayList(arrayList5);
                            }
                        }
                    } catch (ExecutionException e3) {
                        if (z) {
                            c8227yj0.f.d(e3.getCause());
                        }
                        int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                        AbstractC3377dM1.i(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet5 != 0) {
                            return;
                        }
                        ArrayList arrayList6 = c8227yj0.b;
                        if (arrayList6 != null) {
                            c0365El = c8227yj0.f;
                            arrayList = new ArrayList(arrayList6);
                        }
                    }
                    if (iDecrementAndGet == 0) {
                        ArrayList arrayList7 = c8227yj0.b;
                        if (arrayList7 != null) {
                            c0365El = c8227yj0.f;
                            arrayList = new ArrayList(arrayList7);
                            c0365El.b(arrayList);
                            return;
                        }
                        AbstractC3377dM1.i(c8227yj0.isDone(), null);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    AbstractC3377dM1.i(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet6 == 0) {
                        ArrayList arrayList8 = c8227yj0.b;
                        if (arrayList8 != null) {
                            c8227yj0.f.b(new ArrayList(arrayList8));
                        } else {
                            AbstractC3377dM1.i(c8227yj0.isDone(), null);
                        }
                    }
                    throw th;
                }
            case 4:
                ((L71) this.c).b(this.b, (Intent) this.d);
                return;
            default:
                ((SystemForegroundService) this.d).e.notify(this.b, (Notification) this.c);
                return;
        }
    }

    public /* synthetic */ RunnableC5251j7(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }

    public /* synthetic */ RunnableC5251j7(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public RunnableC5251j7(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.a = 1;
        this.d = bottomSheetBehavior;
        this.c = view;
        this.b = i;
    }
}
