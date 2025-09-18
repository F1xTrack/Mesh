package defpackage;

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
public final class C8312zA0 extends AbstractC8085xz0 implements InterfaceC3635ej0 {
    public int N;
    public boolean O;
    public float P;
    public float Q;
    public float R;
    public String S;
    public int T;
    public String U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public JV e0;
    public boolean q1;
    public boolean r1;
    public float s1;
    public float t1;
    public float u1;
    public int v1;
    public int w1;

    private void setTouchesEnabled(boolean z) {
        w(this, z);
    }

    public static void w(View view, boolean z) {
        if (z) {
            view.setOnTouchListener(null);
        } else {
            view.setOnTouchListener(new ViewOnTouchListenerC0584Hg(1));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                w(viewGroup.getChildAt(i), z);
            }
        }
    }

    @Override // defpackage.InterfaceC3635ej0
    public final void a(C3826fj0 c3826fj0) {
        String uri = c3826fj0.a.getUri();
        Integer destPageIdx = c3826fj0.a.getDestPageIdx();
        if (uri == null || uri.isEmpty()) {
            if (destPageIdx != null) {
                l(destPageIdx.intValue());
                return;
            }
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", "linkPressed|".concat(uri));
        InterfaceC7405uP interfaceC7405uPB = OZ1.b((S91) getContext(), getId());
        C3622ef c3622ef = new C3622ef(OZ1.e(this), getId(), writableMapCreateMap, 7);
        if (interfaceC7405uPB != null) {
            interfaceC7405uPB.g(c3622ef);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws FileNotFoundException {
        super.onAttachedToWindow();
        if (this.l) {
            v();
        }
    }

    @Override // defpackage.AbstractC8085xz0, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if ((i <= 0 || i2 <= 0) && this.v1 <= 0 && this.w1 <= 0) {
            return;
        }
        super.onSizeChanged(i, i2, this.v1, this.w1);
        this.v1 = i;
        this.w1 = i2;
    }

    public void setEnableAnnotationRendering(boolean z) {
        this.W = z;
    }

    public void setEnableAntialiasing(boolean z) {
        this.V = z;
    }

    public void setEnableDoubleTapZoom(boolean z) {
        this.a0 = z;
    }

    public void setEnablePaging(boolean z) {
        if (z) {
            this.b0 = true;
            this.c0 = true;
            this.d0 = true;
        } else {
            this.b0 = false;
            this.c0 = false;
            this.d0 = false;
        }
    }

    public void setFitPolicy(int i) {
        if (i == 0) {
            this.e0 = JV.a;
        } else if (i != 1) {
            this.e0 = JV.c;
        } else {
            this.e0 = JV.b;
        }
    }

    public void setHorizontal(boolean z) {
        this.O = z;
    }

    public void setMaxScale(float f) {
        this.R = f;
    }

    public void setMinScale(float f) {
        this.Q = f;
    }

    public void setPage(int i) {
        if (i <= 1) {
            i = 1;
        }
        this.N = i;
    }

    public void setPassword(String str) {
        this.U = str;
    }

    public void setPath(String str) {
        this.S = str;
    }

    public void setScale(float f) {
        this.P = f;
    }

    public void setScrollEnabled(boolean z) {
        this.r1 = z;
    }

    public void setSinglePage(boolean z) {
        this.q1 = z;
    }

    public void setSpacing(int i) {
        this.T = i;
    }

    public final void v() throws FileNotFoundException {
        C7895wz0 c7895wz0;
        if (this.S != null) {
            setMinZoom(this.Q);
            setMaxZoom(this.R);
            setMidZoom((this.R + this.Q) / 2.0f);
            TT1.b = this.Q;
            TT1.a = this.R;
            if (this.S.startsWith("content://")) {
                try {
                    InputStream inputStreamOpenInputStream = getContext().getContentResolver().openInputStream(Uri.parse(this.S));
                    OF of = new OF();
                    of.a = inputStreamOpenInputStream;
                    c7895wz0 = new C7895wz0(this, of);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e.getMessage());
                }
            } else {
                String str = this.S;
                Uri uriFromFile = Uri.parse(str);
                if (uriFromFile.getScheme() == null || uriFromFile.getScheme().isEmpty()) {
                    uriFromFile = Uri.fromFile(new File(str));
                }
                C5826m71 c5826m71 = new C5826m71(3);
                c5826m71.b = uriFromFile;
                c7895wz0 = new C7895wz0(this, c5826m71);
            }
            int i = this.N - 1;
            c7895wz0.l = i;
            c7895wz0.m = this.O;
            c7895wz0.h = this;
            c7895wz0.f = this;
            c7895wz0.g = this;
            c7895wz0.e = this;
            c7895wz0.i = this;
            c7895wz0.q = this.T;
            c7895wz0.o = this.U;
            c7895wz0.p = this.V;
            c7895wz0.s = this.e0;
            c7895wz0.u = this.d0;
            c7895wz0.r = this.b0;
            c7895wz0.t = this.c0;
            boolean z = this.q1;
            c7895wz0.c = !z && this.r1;
            c7895wz0.d = !z && this.a0;
            c7895wz0.n = this.W;
            c7895wz0.k = this;
            if (z) {
                c7895wz0.b = new int[]{i};
                setTouchesEnabled(false);
            } else {
                c7895wz0.j = this;
            }
            c7895wz0.a();
        }
    }
}
