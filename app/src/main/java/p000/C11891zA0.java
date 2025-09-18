package p000;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: zA0 */
/* loaded from: classes2.dex */
public final class C11891zA0 extends AbstractC11739xz0 implements InterfaceC9277ej0 {

    /* renamed from: N */
    public int f46695N;

    /* renamed from: O */
    public boolean f46696O;

    /* renamed from: P */
    public float f46697P;

    /* renamed from: Q */
    public float f46698Q;

    /* renamed from: R */
    public float f46699R;

    /* renamed from: S */
    public String f46700S;

    /* renamed from: T */
    public int f46701T;

    /* renamed from: U */
    public String f46702U;

    /* renamed from: V */
    public boolean f46703V;

    /* renamed from: W */
    public boolean f46704W;

    /* renamed from: a0 */
    public boolean f46705a0;

    /* renamed from: b0 */
    public boolean f46706b0;

    /* renamed from: c0 */
    public boolean f46707c0;

    /* renamed from: d0 */
    public boolean f46708d0;

    /* renamed from: e0 */
    public EnumC0599JV f46709e0;

    /* renamed from: q1 */
    public boolean f46710q1;

    /* renamed from: r1 */
    public boolean f46711r1;

    /* renamed from: s1 */
    public float f46712s1;

    /* renamed from: t1 */
    public float f46713t1;

    /* renamed from: u1 */
    public float f46714u1;

    /* renamed from: v1 */
    public int f46715v1;

    /* renamed from: w1 */
    public int f46716w1;

    private void setTouchesEnabled(boolean z) {
        m26323w(this, z);
    }

    /* renamed from: w */
    public static void m26323w(View view, boolean z) {
        if (z) {
            view.setOnTouchListener(null);
        } else {
            view.setOnTouchListener(new ViewOnTouchListenerC0484Hg(1));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m26323w(viewGroup.getChildAt(i), z);
            }
        }
    }

    @Override // p000.InterfaceC9277ej0
    /* renamed from: a */
    public final void mo9684a(C9405fj0 c9405fj0) {
        String uri = c9405fj0.f27354a.getUri();
        Integer destPageIdx = c9405fj0.f27354a.getDestPageIdx();
        if (uri == null || uri.isEmpty()) {
            if (destPageIdx != null) {
                m26019l(destPageIdx.intValue());
                return;
            }
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", "linkPressed|".concat(uri));
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((S91) getContext(), getId());
        C4004ef c4004ef = new C4004ef(OZ1.m6094e(this), getId(), writableMapCreateMap, 7);
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(c4004ef);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws FileNotFoundException {
        super.onAttachedToWindow();
        if (this.f45945l) {
            m26324v();
        }
    }

    @Override // p000.AbstractC11739xz0, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if ((i <= 0 || i2 <= 0) && this.f46715v1 <= 0 && this.f46716w1 <= 0) {
            return;
        }
        super.onSizeChanged(i, i2, this.f46715v1, this.f46716w1);
        this.f46715v1 = i;
        this.f46716w1 = i2;
    }

    public void setEnableAnnotationRendering(boolean z) {
        this.f46704W = z;
    }

    public void setEnableAntialiasing(boolean z) {
        this.f46703V = z;
    }

    public void setEnableDoubleTapZoom(boolean z) {
        this.f46705a0 = z;
    }

    public void setEnablePaging(boolean z) {
        if (z) {
            this.f46706b0 = true;
            this.f46707c0 = true;
            this.f46708d0 = true;
        } else {
            this.f46706b0 = false;
            this.f46707c0 = false;
            this.f46708d0 = false;
        }
    }

    public void setFitPolicy(int i) {
        if (i == 0) {
            this.f46709e0 = EnumC0599JV.f5557a;
        } else if (i != 1) {
            this.f46709e0 = EnumC0599JV.f5559c;
        } else {
            this.f46709e0 = EnumC0599JV.f5558b;
        }
    }

    public void setHorizontal(boolean z) {
        this.f46696O = z;
    }

    public void setMaxScale(float f) {
        this.f46699R = f;
    }

    public void setMinScale(float f) {
        this.f46698Q = f;
    }

    public void setPage(int i) {
        if (i <= 1) {
            i = 1;
        }
        this.f46695N = i;
    }

    public void setPassword(String str) {
        this.f46702U = str;
    }

    public void setPath(String str) {
        this.f46700S = str;
    }

    public void setScale(float f) {
        this.f46697P = f;
    }

    public void setScrollEnabled(boolean z) {
        this.f46711r1 = z;
    }

    public void setSinglePage(boolean z) {
        this.f46710q1 = z;
    }

    public void setSpacing(int i) {
        this.f46701T = i;
    }

    /* renamed from: v */
    public final void m26324v() throws FileNotFoundException {
        C11612wz0 c11612wz0;
        if (this.f46700S != null) {
            setMinZoom(this.f46698Q);
            setMaxZoom(this.f46699R);
            setMidZoom((this.f46699R + this.f46698Q) / 2.0f);
            TT1.f11393b = this.f46698Q;
            TT1.f11392a = this.f46699R;
            if (this.f46700S.startsWith("content://")) {
                try {
                    InputStream inputStreamOpenInputStream = getContext().getContentResolver().openInputStream(Uri.parse(this.f46700S));
                    C0897OF c0897of = new C0897OF();
                    c0897of.f8325a = inputStreamOpenInputStream;
                    c11612wz0 = new C11612wz0(this, c0897of);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e.getMessage());
                }
            } else {
                String str = this.f46700S;
                Uri uriFromFile = Uri.parse(str);
                if (uriFromFile.getScheme() == null || uriFromFile.getScheme().isEmpty()) {
                    uriFromFile = Uri.fromFile(new File(str));
                }
                C10226m71 c10226m71 = new C10226m71(3);
                c10226m71.f37493b = uriFromFile;
                c11612wz0 = new C11612wz0(this, c10226m71);
            }
            int i = this.f46695N - 1;
            c11612wz0.f45230l = i;
            c11612wz0.f45231m = this.f46696O;
            c11612wz0.f45226h = this;
            c11612wz0.f45224f = this;
            c11612wz0.f45225g = this;
            c11612wz0.f45223e = this;
            c11612wz0.f45227i = this;
            c11612wz0.f45235q = this.f46701T;
            c11612wz0.f45233o = this.f46702U;
            c11612wz0.f45234p = this.f46703V;
            c11612wz0.f45237s = this.f46709e0;
            c11612wz0.f45239u = this.f46708d0;
            c11612wz0.f45236r = this.f46706b0;
            c11612wz0.f45238t = this.f46707c0;
            boolean z = this.f46710q1;
            c11612wz0.f45221c = !z && this.f46711r1;
            c11612wz0.f45222d = !z && this.f46705a0;
            c11612wz0.f45232n = this.f46704W;
            c11612wz0.f45229k = this;
            if (z) {
                c11612wz0.f45220b = new int[]{i};
                setTouchesEnabled(false);
            } else {
                c11612wz0.f45228j = this;
            }
            c11612wz0.m25729a();
        }
    }
}
