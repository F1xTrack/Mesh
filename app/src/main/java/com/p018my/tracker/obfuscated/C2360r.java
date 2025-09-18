package com.p018my.tracker.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.my.tracker.obfuscated.r */
/* loaded from: classes2.dex */
public final class C2360r extends AbstractC2366s1 {

    /* renamed from: c */
    private final a f20108c;

    /* renamed from: com.my.tracker.obfuscated.r$a */
    public static class a extends ByteArrayOutputStream {

        /* renamed from: a */
        private final int f20109a;

        /* renamed from: b */
        private int f20110b;

        /* renamed from: c */
        private int f20111c;

        public a(int i) {
            super(i);
            this.f20109a = i;
            this.f20110b = Integer.MAX_VALUE;
            this.f20111c = -1;
        }

        /* renamed from: m */
        public synchronized void m13463m() {
            try {
                reset();
                if (AbstractC2391y2.m13571a()) {
                    StringBuilder sb = new StringBuilder("SimpleByteArrayOutputStream: minSize=");
                    int i = this.f20110b;
                    if (i == Integer.MAX_VALUE) {
                        i = 0;
                    }
                    sb.append(i);
                    sb.append(", maxSize=");
                    sb.append(this.f20111c);
                    sb.append(", truncate=");
                    sb.append(this.f20109a);
                    AbstractC2391y2.m13568a(sb.toString());
                }
                this.f20110b = Integer.MAX_VALUE;
                this.f20111c = -1;
                int length = ((ByteArrayOutputStream) this).buf.length;
                int i2 = this.f20109a;
                if (length > i2) {
                    ((ByteArrayOutputStream) this).buf = new byte[i2];
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            try {
                int i = ((ByteArrayOutputStream) this).count;
                if (i > 0) {
                    this.f20110b = Math.min(this.f20110b, i);
                }
                this.f20111c = Math.max(((ByteArrayOutputStream) this).count, this.f20111c);
                super.reset();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C2360r(int i) {
        super(new a(i));
        this.f20108c = (a) this.f20122a;
    }

    /* renamed from: a */
    public void m13458a() {
        this.f20108c.reset();
    }

    /* renamed from: b */
    public int m13460b() {
        return this.f20108c.size();
    }

    /* renamed from: c */
    public byte[] m13461c() {
        return this.f20108c.toByteArray();
    }

    /* renamed from: d */
    public void m13462d() {
        this.f20108c.m13463m();
    }

    /* renamed from: a */
    public void m13459a(OutputStream outputStream) throws IOException {
        this.f20108c.writeTo(outputStream);
    }
}
