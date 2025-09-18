package p000;

import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: jE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9855jE0 {

    /* renamed from: a */
    public int f34995a;

    /* renamed from: b */
    public int f34996b;

    /* renamed from: c */
    public int f34997c;

    /* renamed from: d */
    public int f34998d;

    /* renamed from: e */
    public int f34999e;

    /* renamed from: f */
    public int f35000f;

    /* renamed from: g */
    public boolean f35001g;

    /* renamed from: h */
    public final E00 f35002h;

    public C9855jE0(E00 e00) {
        e00.getClass();
        this.f35002h = e00;
        this.f34997c = 0;
        this.f34996b = 0;
        this.f34998d = 0;
        this.f35000f = 0;
        this.f34999e = 0;
        this.f34995a = 0;
    }

    /* renamed from: a */
    public final boolean m22009a(C9595hC0 c9595hC0) throws Throwable {
        int i;
        int i2 = this.f34999e;
        while (this.f34995a != 6 && (i = c9595hC0.read()) != -1) {
            try {
                int i3 = this.f34997c;
                this.f34997c = i3 + 1;
                if (this.f35001g) {
                    this.f34995a = 6;
                    this.f35001g = false;
                    return false;
                }
                int i4 = this.f34995a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    this.f34995a = 5;
                                } else if (i4 != 5) {
                                    ML1.m5338e(false);
                                } else {
                                    int i5 = ((this.f34996b << 8) + i) - 2;
                                    AbstractC9246eT1.m17998c(c9595hC0, i5);
                                    this.f34997c += i5;
                                    this.f34995a = 2;
                                }
                            } else if (i == 255) {
                                this.f34995a = 3;
                            } else if (i == 0) {
                                this.f34995a = 2;
                            } else if (i == 217) {
                                this.f35001g = true;
                                int i6 = i3 - 1;
                                int i7 = this.f34998d;
                                if (i7 > 0) {
                                    this.f35000f = i6;
                                }
                                this.f34998d = i7 + 1;
                                this.f34999e = i7;
                                this.f34995a = 2;
                            } else {
                                if (i == 218) {
                                    int i8 = i3 - 1;
                                    int i9 = this.f34998d;
                                    if (i9 > 0) {
                                        this.f35000f = i8;
                                    }
                                    this.f34998d = i9 + 1;
                                    this.f34999e = i9;
                                }
                                if (i == 1 || ((i >= 208 && i <= 215) || i == 217 || i == 216)) {
                                    this.f34995a = 2;
                                } else {
                                    this.f34995a = 4;
                                }
                            }
                        } else if (i == 255) {
                            this.f34995a = 3;
                        }
                    } else if (i == 216) {
                        this.f34995a = 2;
                    } else {
                        this.f34995a = 6;
                    }
                } else if (i == 255) {
                    this.f34995a = 1;
                } else {
                    this.f34995a = 6;
                }
                this.f34996b = i;
            } catch (IOException e) {
                AbstractC11176tY1.m24943b(e);
                throw null;
            }
        }
        return (this.f34995a == 6 || this.f34999e == i2) ? false : true;
    }

    /* renamed from: b */
    public final boolean m22010b(EncodedImage encodedImage) {
        if (this.f34995a == 6 || encodedImage.getSize() <= this.f34997c) {
            return false;
        }
        InputStream inputStreamOrThrow = encodedImage.getInputStreamOrThrow();
        E00 e00 = this.f35002h;
        C9595hC0 c9595hC0 = new C9595hC0(inputStreamOrThrow, (byte[]) e00.get(16384), e00);
        try {
            try {
                AbstractC9246eT1.m17998c(c9595hC0, this.f34997c);
                return m22009a(c9595hC0);
            } catch (IOException e) {
                AbstractC11176tY1.m24943b(e);
                throw null;
            }
        } finally {
            AbstractC0119Bt.m900b(c9595hC0);
        }
    }
}
