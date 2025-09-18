package p000;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: l31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10089l31 implements GLSurfaceView.Renderer, InterfaceC8194Qy0 {

    /* renamed from: a */
    public final C11552wV0 f36846a;

    /* renamed from: d */
    public final float[] f36849d;

    /* renamed from: e */
    public final float[] f36850e;

    /* renamed from: f */
    public final float[] f36851f;

    /* renamed from: g */
    public float f36852g;

    /* renamed from: h */
    public float f36853h;

    /* renamed from: k */
    public final /* synthetic */ C10217m31 f36856k;

    /* renamed from: b */
    public final float[] f36847b = new float[16];

    /* renamed from: c */
    public final float[] f36848c = new float[16];

    /* renamed from: i */
    public final float[] f36854i = new float[16];

    /* renamed from: j */
    public final float[] f36855j = new float[16];

    public C10089l31(C10217m31 c10217m31, C11552wV0 c11552wV0) {
        this.f36856k = c10217m31;
        float[] fArr = new float[16];
        this.f36849d = fArr;
        float[] fArr2 = new float[16];
        this.f36850e = fArr2;
        float[] fArr3 = new float[16];
        this.f36851f = fArr3;
        this.f36846a = c11552wV0;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f36853h = 3.1415927f;
    }

    @Override // p000.InterfaceC8194Qy0
    /* renamed from: a */
    public final synchronized void mo244a(float f, float[] fArr) {
        float[] fArr2 = this.f36849d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.f36853h = f2;
        Matrix.setRotateM(this.f36850e, 0, -this.f36852g, (float) Math.cos(f2), (float) Math.sin(this.f36853h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.f36855j, 0, this.f36849d, 0, this.f36851f, 0);
            Matrix.multiplyMM(this.f36854i, 0, this.f36850e, 0, this.f36855j, 0);
        }
        Matrix.multiplyMM(this.f36848c, 0, this.f36847b, 0, this.f36854i, 0);
        this.f36846a.m25641d(this.f36848c);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.f36847b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        C10217m31 c10217m31 = this.f36856k;
        c10217m31.f37441e.post(new MD0(c10217m31, 22, this.f36846a.m25642e()));
    }
}
