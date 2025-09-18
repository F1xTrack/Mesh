package defpackage;

import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: jE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5273jE0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public final E00 h;

    public C5273jE0(E00 e00) {
        e00.getClass();
        this.h = e00;
        this.c = 0;
        this.b = 0;
        this.d = 0;
        this.f = 0;
        this.e = 0;
        this.a = 0;
    }

    public final boolean a(C4109hC0 c4109hC0) throws Throwable {
        int i;
        int i2 = this.e;
        while (this.a != 6 && (i = c4109hC0.read()) != -1) {
            try {
                int i3 = this.c;
                this.c = i3 + 1;
                if (this.g) {
                    this.a = 6;
                    this.g = false;
                    return false;
                }
                int i4 = this.a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    this.a = 5;
                                } else if (i4 != 5) {
                                    ML1.e(false);
                                } else {
                                    int i5 = ((this.b << 8) + i) - 2;
                                    AbstractC3588eT1.c(c4109hC0, i5);
                                    this.c += i5;
                                    this.a = 2;
                                }
                            } else if (i == 255) {
                                this.a = 3;
                            } else if (i == 0) {
                                this.a = 2;
                            } else if (i == 217) {
                                this.g = true;
                                int i6 = i3 - 1;
                                int i7 = this.d;
                                if (i7 > 0) {
                                    this.f = i6;
                                }
                                this.d = i7 + 1;
                                this.e = i7;
                                this.a = 2;
                            } else {
                                if (i == 218) {
                                    int i8 = i3 - 1;
                                    int i9 = this.d;
                                    if (i9 > 0) {
                                        this.f = i8;
                                    }
                                    this.d = i9 + 1;
                                    this.e = i9;
                                }
                                if (i == 1 || ((i >= 208 && i <= 215) || i == 217 || i == 216)) {
                                    this.a = 2;
                                } else {
                                    this.a = 4;
                                }
                            }
                        } else if (i == 255) {
                            this.a = 3;
                        }
                    } else if (i == 216) {
                        this.a = 2;
                    } else {
                        this.a = 6;
                    }
                } else if (i == 255) {
                    this.a = 1;
                } else {
                    this.a = 6;
                }
                this.b = i;
            } catch (IOException e) {
                AbstractC7243tY1.b(e);
                throw null;
            }
        }
        return (this.a == 6 || this.e == i2) ? false : true;
    }

    public final boolean b(EncodedImage encodedImage) {
        if (this.a == 6 || encodedImage.getSize() <= this.c) {
            return false;
        }
        InputStream inputStreamOrThrow = encodedImage.getInputStreamOrThrow();
        E00 e00 = this.h;
        C4109hC0 c4109hC0 = new C4109hC0(inputStreamOrThrow, (byte[]) e00.get(16384), e00);
        try {
            try {
                AbstractC3588eT1.c(c4109hC0, this.c);
                return a(c4109hC0);
            } catch (IOException e) {
                AbstractC7243tY1.b(e);
                throw null;
            }
        } finally {
            AbstractC0155Bt.b(c4109hC0);
        }
    }
}
