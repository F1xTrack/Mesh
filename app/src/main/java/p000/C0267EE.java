package p000;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.facebook.react.bridge.UIManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.p019vk.push.common.Logger;
import expo.modules.kotlin.jni.JNIFunctionBody;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.impl.RunnableC4654M5;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* renamed from: EE */
/* loaded from: classes.dex */
public final /* synthetic */ class C0267EE implements InterfaceC1464XG, InterfaceC11821yc1, InterfaceC8216Rj0, InterfaceC1319Uy, InterfaceC6696qh, InterfaceC0363Fl, InterfaceC6560oZ, InterfaceC9233eN0, InterfaceC11752y40, InterfaceC9071d60, JNIFunctionBody, InterfaceC6471n9, ActivationBarrierCallback, InterfaceC8590Yo0, InterfaceC9713i70, InterfaceC9009cf1, InterfaceC8346Tw0 {

    /* renamed from: a */
    public final /* synthetic */ int f2542a;

    /* renamed from: b */
    public final /* synthetic */ Object f2543b;

    public /* synthetic */ C0267EE(int i, Object obj) {
        this.f2542a = i;
        this.f2543b = obj;
    }

    @Override // p000.InterfaceC8590Yo0
    /* renamed from: a */
    public int mo2069a(Object obj) {
        C8018No0 c8018No0 = (C8018No0) obj;
        c8018No0.getClass();
        C6686qX c6686qX = (C6686qX) this.f2543b;
        String str = c6686qX.f40974m;
        String str2 = c8018No0.f8010b;
        return ((str2.equals(str) || str2.equals(AbstractC8642Zo0.m9600b(c6686qX))) && c8018No0.m5850c(c6686qX, false)) ? 1 : 0;
    }

    @Override // p000.InterfaceC11821yc1
    public InterfaceFutureC7800Jj0 apply(Object obj) {
        return (InterfaceFutureC7800Jj0) ((C7236z) this.f2543b).invoke(obj);
    }

    /* renamed from: b */
    public boolean m2070b(C7621Fx1 c7621Fx1, int i, Bundle bundle) {
        InterfaceC7171xy c9196e41;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((D80) c7621Fx1.f3494a).mo994h();
                Parcelable parcelable = (Parcelable) ((D80) c7621Fx1.f3494a).mo996r();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        ClipDescription description = ((D80) c7621Fx1.f3494a).getDescription();
        D80 d80 = (D80) c7621Fx1.f3494a;
        ClipData clipData = new ClipData(description, new ClipData.Item(d80.mo993e()));
        if (i2 >= 31) {
            c9196e41 = new C9196e41(clipData, 2);
        } else {
            C7234yy c7234yy = new C7234yy();
            c7234yy.f46552b = clipData;
            c7234yy.f46553c = 2;
            c9196e41 = c7234yy;
        }
        c9196e41.mo17847J(d80.mo995i());
        c9196e41.setExtras(bundle);
        return AbstractC10944rk1.m24478j((C0700L6) this.f2543b, c9196e41.mo17858a()) == null;
    }

    @Override // p000.InterfaceC8346Tw0
    /* renamed from: c */
    public Object mo2071c() {
        InterfaceC7431Cg1 interfaceC7431Cg1 = (InterfaceC7431Cg1) this.f2543b;
        O90.m5968f(interfaceC7431Cg1, "$allocator");
        return interfaceC7431Cg1.mo1269a();
    }

    /* renamed from: d */
    public void m2072d(SpannableStringBuilder spannableStringBuilder) {
        String strM1554m = D51.m1554m(D51.m1554m(D51.m1554m(D51.m1554m(D51.m1554m(D51.m1554m(D51.m1554m(D51.m1554m(((C6270jy) this.f2543b).f35464a, "\r\n", "<br>"), "\n", "<br>"), " ", "&nbsp;"), "\t", "&nbsp;&nbsp;&nbsp;&nbsp;"), "<sub>", "<sub><small>"), "</sub>", "</small></sub>"), "<sup>", "<sup><small>"), "</sup>", "</small></sup>");
        Spanned spannedM7169a = Build.VERSION.SDK_INT >= 24 ? S30.m7169a(strM1554m, 0) : Html.fromHtml(strM1554m);
        O90.m5967e(spannedM7169a, "fromHtml(...)");
        spannableStringBuilder.append((CharSequence) spannedM7169a);
    }

    @Override // p000.InterfaceC9009cf1
    /* renamed from: e */
    public String mo2073e(String str) {
        return ((UIManager) this.f2543b).resolveCustomDirectEventName(str);
    }

    @Override // p000.InterfaceC6696qh
    /* renamed from: f */
    public long mo1472f(long j) {
        return AbstractC7485Dh1.m1826k((j * r0.f11822e) / 1000000, 0L, ((C1290UV) this.f2543b).f11827j - 1);
    }

    @Override // p000.InterfaceC11752y40
    /* renamed from: h */
    public void mo2074h(String str) {
        F71 f71 = (F71) this.f2543b;
        O90.m5968f(str, "it");
        Logger.DefaultImpls.info$default((Logger) f71.getValue(), str, null, 2, null);
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        switch (this.f2542a) {
            case 14:
                C0411GW c0411gw = (C0411GW) this.f2543b;
                c0411gw.getClass();
                c0411gw.f3775b.execute(new RunnableC1096RQ(c0411gw, 3, c0300El));
                return "triggerAePrecapture";
            default:
                C7967Mo1 c7967Mo1 = (C7967Mo1) this.f2543b;
                c7967Mo1.getClass();
                QR1.m6710h().execute(new RunnableC1096RQ(c7967Mo1, 15, c0300El));
                return c7967Mo1 + " [fetch@" + SystemClock.uptimeMillis() + "]";
        }
    }

    @Override // p000.InterfaceC1464XG
    /* renamed from: i */
    public C9367fQ0 mo2075i(int i, C8149Qb1 c8149Qb1, int[] iArr) {
        M70 m70M6233t = P70.m6233t();
        for (int i2 = 0; i2 < c8149Qb1.f9687a; i2++) {
            int i3 = i2;
            m70M6233t.m3755a(new C1024QG(i, c8149Qb1, i3, (C1212TG) this.f2543b, iArr[i2]));
        }
        return m70M6233t.m5273h();
    }

    @Override // p000.InterfaceC9071d60
    /* renamed from: i0 */
    public void mo2076i0(C11814yZ0 c11814yZ0) {
        ((InterfaceC9071d60) this.f2543b).mo2076i0(c11814yZ0);
    }

    @Override // expo.modules.kotlin.jni.JNIFunctionBody
    public Object invoke(Object[] objArr) {
        C7053w5 c7053w5 = (C7053w5) this.f2543b;
        O90.m5968f(objArr, "it");
        c7053w5.invoke();
        return C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC9713i70
    /* renamed from: k */
    public void mo504k(InterfaceC9841j70 interfaceC9841j70) {
        C7764Ir0 c7764Ir0 = (C7764Ir0) this.f2543b;
        synchronized (c7764Ir0.f5172a) {
            c7764Ir0.f5174c++;
        }
        c7764Ir0.m4043g(interfaceC9841j70);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        RunnableC4654M5.m19627a((RunnableC4654M5) this.f2543b);
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) throws IOException {
        Object obj;
        switch (this.f2542a) {
            case 12:
                return (C6890tV) ((C9450g32) this.f2543b).mo11142i();
            default:
                ((C8128Pr0) this.f2543b).getClass();
                C9450g32 c9450g32 = (C9450g32) task;
                synchronized (c9450g32.f27543a) {
                    Preconditions.checkState(c9450g32.f27545c, "Task is not yet complete");
                    if (c9450g32.f27546d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    if (IOException.class.isInstance(c9450g32.f27548f)) {
                        throw ((Throwable) IOException.class.cast(c9450g32.f27548f));
                    }
                    Exception exc = c9450g32.f27548f;
                    if (exc != null) {
                        throw new C10143lU0(exc);
                    }
                    obj = c9450g32.f27547e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                bundle.toString();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @Override // p000.InterfaceC11821yc1
    public Object apply(Object obj) throws IOException {
        switch (this.f2542a) {
            case 4:
                OY0 oy0 = (OY0) obj;
                ((C7391Bm1) this.f2543b).getClass();
                String strM6779v = PY0.f9131b.m6779v(oy0);
                O90.m5967e(strM6779v, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
                oy0.getClass();
                byte[] bytes = strM6779v.getBytes(AbstractC7038vr.f44561a);
                O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
                return bytes;
            default:
                C7993Nb1 c7993Nb1 = (C7993Nb1) obj;
                ((C0665KY) this.f2543b).getClass();
                return c7993Nb1;
        }
    }

    @Override // p000.InterfaceC8216Rj0
    public void invoke(Object obj) {
        GB0 gb0 = (GB0) obj;
        switch (this.f2542a) {
            case 5:
                gb0.mo2961t((C11337up0) this.f2543b);
                break;
            case 6:
                gb0.mo2949b((C1017Q9) this.f2543b);
                break;
            case 7:
                gb0.mo2956n((C6996vB) this.f2543b);
                break;
            case 8:
                gb0.mo2961t(((SurfaceHolderCallbackC1285UQ) this.f2543b).f11780a.f13703O);
                break;
            case 9:
                gb0.mo2944F((C7660Gr0) this.f2543b);
                break;
            default:
                gb0.mo2950e((C8321Tj1) this.f2543b);
                break;
        }
    }
}
