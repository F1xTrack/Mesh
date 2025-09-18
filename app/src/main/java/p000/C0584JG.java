package p000;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: JG */
/* loaded from: classes.dex */
public final class C0584JG implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    public final C10715py0 f5430a;

    /* renamed from: b */
    public final HandlerThread f5431b;

    /* renamed from: c */
    public final C20 f5432c;

    /* renamed from: d */
    public final Handler f5433d;

    /* renamed from: e */
    public final AtomicBoolean f5434e;

    /* renamed from: f */
    public final float[] f5435f;

    /* renamed from: g */
    public final float[] f5436g;

    /* renamed from: h */
    public final LinkedHashMap f5437h;

    /* renamed from: i */
    public int f5438i;

    /* renamed from: j */
    public boolean f5439j;

    /* renamed from: k */
    public final ArrayList f5440k;

    public C0584JG(C0149CM c0149cm) {
        Map mapEmptyMap = Collections.emptyMap();
        this.f5434e = new AtomicBoolean(false);
        this.f5435f = new float[16];
        this.f5436g = new float[16];
        this.f5437h = new LinkedHashMap();
        this.f5438i = 0;
        this.f5439j = false;
        this.f5440k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f5431b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f5433d = handler;
        this.f5432c = new C20(handler);
        this.f5430a = new C10715py0();
        try {
            try {
                AbstractC11797yQ1.m26149b(new C4224i9(this, c0149cm, mapEmptyMap, 6)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            m4270e();
            throw e2;
        }
    }

    /* renamed from: a */
    public final void m4266a() {
        if (this.f5439j && this.f5438i == 0) {
            LinkedHashMap linkedHashMap = this.f5437h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((T61) it.next()).close();
            }
            Iterator it2 = this.f5440k.iterator();
            while (it2.hasNext()) {
                ((C6961ud) it2.next()).f43778c.m2377d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            C10715py0 c10715py0 = this.f5430a;
            if (((AtomicBoolean) c10715py0.f40464d).getAndSet(false)) {
                AbstractC9055d00.m17454c((Thread) c10715py0.f40466f);
                c10715py0.m23913i();
            }
            this.f5431b.quit();
        }
    }

    /* renamed from: b */
    public final void m4267b(Runnable runnable, Runnable runnable2) {
        try {
            this.f5432c.execute(new RunnableC8339Ts1(this, runnable2, runnable, 17));
        } catch (RejectedExecutionException unused) {
            AbstractC7806Jm0.m4412f("DefaultSurfaceProcessor");
            runnable2.run();
        }
    }

    /* renamed from: c */
    public final void m4268c(Exception exc) {
        ArrayList arrayList = this.f5440k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C6961ud) it.next()).f43778c.m2377d(exc);
        }
        arrayList.clear();
    }

    /* renamed from: d */
    public final Bitmap m4269d(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        AbstractC8041Nz1.m5917b(i, fArr2);
        AbstractC8041Nz1.m5918c(fArr2);
        Size sizeM24953g = AbstractC11184tc1.m24953g(size, i);
        C10715py0 c10715py0 = this.f5430a;
        c10715py0.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeM24953g.getHeight() * sizeM24953g.getWidth() * 4);
        AbstractC9104dM1.m17545d("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeM24953g.getHeight() * sizeM24953g.getWidth()) * 4);
        AbstractC9104dM1.m17545d("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = AbstractC9055d00.f25750a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        AbstractC9055d00.m17453b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        AbstractC9055d00.m17453b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        AbstractC9055d00.m17453b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeM24953g.getWidth(), sizeM24953g.getHeight(), 0, 6407, 5121, null);
        AbstractC9055d00.m17453b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        AbstractC9055d00.m17453b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        AbstractC9055d00.m17453b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        AbstractC9055d00.m17453b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        AbstractC9055d00.m17453b("glActiveTexture");
        GLES20.glBindTexture(36197, c10715py0.f40463c);
        AbstractC9055d00.m17453b("glBindTexture");
        c10715py0.f40462b = null;
        GLES20.glViewport(0, 0, sizeM24953g.getWidth(), sizeM24953g.getHeight());
        GLES20.glScissor(0, 0, sizeM24953g.getWidth(), sizeM24953g.getHeight());
        AbstractC8794b00 abstractC8794b00 = (AbstractC8794b00) c10715py0.f40473m;
        abstractC8794b00.getClass();
        if (abstractC8794b00 instanceof C8922c00) {
            GLES20.glUniformMatrix4fv(((C8922c00) abstractC8794b00).f17255f, 1, false, fArr2, 0);
            AbstractC9055d00.m17453b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC9055d00.m17453b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeM24953g.getWidth(), sizeM24953g.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        AbstractC9055d00.m17453b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        AbstractC9055d00.m17453b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        AbstractC9055d00.m17453b("glDeleteFramebuffers");
        int i4 = c10715py0.f40463c;
        GLES20.glActiveTexture(33984);
        AbstractC9055d00.m17453b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        AbstractC9055d00.m17453b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeM24953g.getWidth(), sizeM24953g.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.m9892f(byteBufferAllocateDirect, sizeM24953g.getWidth() * 4, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    /* renamed from: e */
    public final void m4270e() {
        if (this.f5434e.getAndSet(true)) {
            return;
        }
        m4267b(new RunnableC0204DE(4, this), new RunnableC0004A3(1));
    }

    /* renamed from: f */
    public final void m4271f(C9394fd1 c9394fd1) throws IOException {
        ArrayList arrayList = this.f5440k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (c9394fd1 == null) {
            m4268c(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i = -1;
                int i2 = -1;
                Bitmap bitmapM4269d = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    C6961ud c6961ud = (C6961ud) it.next();
                    int i3 = c6961ud.f43777b;
                    if (i != i3 || bitmapM4269d == null) {
                        if (bitmapM4269d != null) {
                            bitmapM4269d.recycle();
                        }
                        bitmapM4269d = m4269d((Size) c9394fd1.f27303b, (float[]) c9394fd1.f27304c, i3);
                        i2 = -1;
                        i = i3;
                    }
                    int i4 = c6961ud.f43776a;
                    if (i2 != i4) {
                        byteArrayOutputStream.reset();
                        bitmapM4269d.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        i2 = i4;
                    }
                    Surface surface = (Surface) c9394fd1.f27302a;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.m9895i(byteArray, surface);
                    c6961ud.f43778c.m2375b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            m4268c(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        if (this.f5434e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f5435f;
        surfaceTexture.getTransformMatrix(fArr);
        C9394fd1 c9394fd1 = null;
        while (true) {
            C9394fd1 c9394fd12 = c9394fd1;
            for (Map.Entry entry : this.f5437h.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                T61 t61 = (T61) entry.getKey();
                float[] fArr2 = t61.f11160e;
                float[] fArr3 = this.f5436g;
                Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
                int i = t61.f11158c;
                if (i == 34) {
                    try {
                        this.f5430a.m23915k(surfaceTexture.getTimestamp(), fArr3, surface);
                    } catch (RuntimeException unused) {
                        AbstractC7806Jm0.m4412f("DefaultSurfaceProcessor");
                    }
                } else {
                    boolean z = true;
                    AbstractC9104dM1.m17550i(i == 256, "Unsupported format: " + i);
                    if (c9394fd12 != null) {
                        z = false;
                    }
                    AbstractC9104dM1.m17550i(z, "Only one JPEG output is supported.");
                    c9394fd1 = new C9394fd1(surface, t61.f11159d, (float[]) fArr3.clone());
                }
            }
            try {
                m4271f(c9394fd12);
                return;
            } catch (RuntimeException e) {
                m4268c(e);
                return;
            }
        }
    }
}
