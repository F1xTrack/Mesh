package defpackage;

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

/* loaded from: classes.dex */
public final class JG implements SurfaceTexture.OnFrameAvailableListener {
    public final C6557py0 a;
    public final HandlerThread b;
    public final C20 c;
    public final Handler d;
    public final AtomicBoolean e;
    public final float[] f;
    public final float[] g;
    public final LinkedHashMap h;
    public int i;
    public boolean j;
    public final ArrayList k;

    public JG(CM cm) {
        Map mapEmptyMap = Collections.emptyMap();
        this.e = new AtomicBoolean(false);
        this.f = new float[16];
        this.g = new float[16];
        this.h = new LinkedHashMap();
        this.i = 0;
        this.j = false;
        this.k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new C20(handler);
        this.a = new C6557py0();
        try {
            try {
                AbstractC8171yQ1.b(new C4290i9(this, cm, mapEmptyMap, 6)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            e();
            throw e2;
        }
    }

    public final void a() {
        if (this.j && this.i == 0) {
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((T61) it.next()).close();
            }
            Iterator it2 = this.k.iterator();
            while (it2.hasNext()) {
                ((C7447ud) it2.next()).c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            C6557py0 c6557py0 = this.a;
            if (((AtomicBoolean) c6557py0.d).getAndSet(false)) {
                AbstractC3306d00.c((Thread) c6557py0.f);
                c6557py0.i();
            }
            this.b.quit();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new RunnableC1557Ts1(this, runnable2, runnable, 17));
        } catch (RejectedExecutionException unused) {
            AbstractC0759Jm0.f("DefaultSurfaceProcessor");
            runnable2.run();
        }
    }

    public final void c(Exception exc) {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C7447ud) it.next()).c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap d(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        AbstractC1110Nz1.b(i, fArr2);
        AbstractC1110Nz1.c(fArr2);
        Size sizeG = AbstractC7255tc1.g(size, i);
        C6557py0 c6557py0 = this.a;
        c6557py0.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeG.getHeight() * sizeG.getWidth() * 4);
        AbstractC3377dM1.d("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeG.getHeight() * sizeG.getWidth()) * 4);
        AbstractC3377dM1.d("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = AbstractC3306d00.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        AbstractC3306d00.b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        AbstractC3306d00.b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        AbstractC3306d00.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeG.getWidth(), sizeG.getHeight(), 0, 6407, 5121, null);
        AbstractC3306d00.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        AbstractC3306d00.b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        AbstractC3306d00.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        AbstractC3306d00.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        AbstractC3306d00.b("glActiveTexture");
        GLES20.glBindTexture(36197, c6557py0.c);
        AbstractC3306d00.b("glBindTexture");
        c6557py0.b = null;
        GLES20.glViewport(0, 0, sizeG.getWidth(), sizeG.getHeight());
        GLES20.glScissor(0, 0, sizeG.getWidth(), sizeG.getHeight());
        AbstractC2240b00 abstractC2240b00 = (AbstractC2240b00) c6557py0.m;
        abstractC2240b00.getClass();
        if (abstractC2240b00 instanceof C2430c00) {
            GLES20.glUniformMatrix4fv(((C2430c00) abstractC2240b00).f, 1, false, fArr2, 0);
            AbstractC3306d00.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC3306d00.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeG.getWidth(), sizeG.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        AbstractC3306d00.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        AbstractC3306d00.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        AbstractC3306d00.b("glDeleteFramebuffers");
        int i4 = c6557py0.c;
        GLES20.glActiveTexture(33984);
        AbstractC3306d00.b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        AbstractC3306d00.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeG.getWidth(), sizeG.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.f(byteBufferAllocateDirect, sizeG.getWidth() * 4, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    public final void e() {
        if (this.e.getAndSet(true)) {
            return;
        }
        b(new DE(4, this), new A3(1));
    }

    public final void f(C3809fd1 c3809fd1) throws IOException {
        ArrayList arrayList = this.k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (c3809fd1 == null) {
            c(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i = -1;
                int i2 = -1;
                Bitmap bitmapD = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    C7447ud c7447ud = (C7447ud) it.next();
                    int i3 = c7447ud.b;
                    if (i != i3 || bitmapD == null) {
                        if (bitmapD != null) {
                            bitmapD.recycle();
                        }
                        bitmapD = d((Size) c3809fd1.b, (float[]) c3809fd1.c, i3);
                        i2 = -1;
                        i = i3;
                    }
                    int i4 = c7447ud.a;
                    if (i2 != i4) {
                        byteArrayOutputStream.reset();
                        bitmapD.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        i2 = i4;
                    }
                    Surface surface = (Surface) c3809fd1.a;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.i(byteArray, surface);
                    c7447ud.c.b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            c(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        if (this.e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f;
        surfaceTexture.getTransformMatrix(fArr);
        C3809fd1 c3809fd1 = null;
        while (true) {
            C3809fd1 c3809fd12 = c3809fd1;
            for (Map.Entry entry : this.h.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                T61 t61 = (T61) entry.getKey();
                float[] fArr2 = t61.e;
                float[] fArr3 = this.g;
                Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
                int i = t61.c;
                if (i == 34) {
                    try {
                        this.a.k(surfaceTexture.getTimestamp(), fArr3, surface);
                    } catch (RuntimeException unused) {
                        AbstractC0759Jm0.f("DefaultSurfaceProcessor");
                    }
                } else {
                    boolean z = true;
                    AbstractC3377dM1.i(i == 256, "Unsupported format: " + i);
                    if (c3809fd12 != null) {
                        z = false;
                    }
                    AbstractC3377dM1.i(z, "Only one JPEG output is supported.");
                    c3809fd1 = new C3809fd1(surface, t61.d, (float[]) fArr3.clone());
                }
            }
            try {
                f(c3809fd12);
                return;
            } catch (RuntimeException e) {
                c(e);
                return;
            }
        }
    }
}
