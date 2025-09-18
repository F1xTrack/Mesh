package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import p000.AbstractC7222ym;
import p000.C0420Gf;
import p000.C0483Hf;
import p000.C9482gJ1;
import p000.DF1;
import p000.DH1;
import p000.WE1;

/* loaded from: classes.dex */
public class BarhopperV3 implements Closeable {

    /* renamed from: a */
    public long f18052a;

    private native void closeNative(long j);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    /* renamed from: g */
    public static C0420Gf m11146g(byte[] bArr) {
        bArr.getClass();
        try {
            DF1 df1 = DF1.f1924b;
            C9482gJ1 c9482gJ1 = C9482gJ1.f27672c;
            return C0420Gf.m3117n(bArr, DF1.f1924b);
        } catch (DH1 e) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e);
        }
    }

    private native byte[] recognizeBitmapNative(long j, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j, int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j, int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j, int i, int i2, int i3, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j, int i, int i2, int i3, byte[] bArr, RecognitionOptions recognitionOptions);

    /* renamed from: a */
    public final void m11147a(C0483Hf c0483Hf) {
        if (this.f18052a != 0) {
            return;
        }
        try {
            int iM6622c = c0483Hf.m6622c();
            byte[] bArr = new byte[iM6622c];
            WE1 we1 = new WE1(bArr, iM6622c);
            c0483Hf.m6627l(we1);
            if (iM6622c - we1.f13090d != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            long jCreateNativeWithClientOptions = createNativeWithClientOptions(bArr);
            this.f18052a = jCreateNativeWithClientOptions;
            if (jCreateNativeWithClientOptions == 0) {
                throw new IllegalArgumentException("Failed to create native pointer with client options.");
            }
        } catch (IOException e) {
            throw new RuntimeException(AbstractC7222ym.m26234k("Serializing ", C0483Hf.class.getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    /* renamed from: c */
    public final C0420Gf m11148c(int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j = this.f18052a;
        if (j != 0) {
            return m11146g(recognizeBufferNative(j, i, i2, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.f18052a;
        if (j != 0) {
            closeNative(j);
            this.f18052a = 0L;
        }
    }

    /* renamed from: e */
    public final C0420Gf m11149e(int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j = this.f18052a;
        if (j != 0) {
            return m11146g(recognizeNative(j, i, i2, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    /* renamed from: f */
    public final C0420Gf m11150f(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.f18052a == 0) {
            throw new IllegalStateException("Native pointer does not exist.");
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig()));
            bitmap = bitmap.copy(config2, bitmap.isMutable());
        }
        return m11146g(recognizeBitmapNative(this.f18052a, bitmap, recognitionOptions));
    }
}
