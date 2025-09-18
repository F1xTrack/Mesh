package p000;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* renamed from: pL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10637pL0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReactApplicationContext f40021a;

    /* renamed from: b */
    public final /* synthetic */ String f40022b;

    /* renamed from: c */
    public final /* synthetic */ String f40023c;

    /* renamed from: d */
    public final /* synthetic */ int f40024d;

    /* renamed from: e */
    public final /* synthetic */ int f40025e;

    /* renamed from: f */
    public final /* synthetic */ String f40026f;

    public RunnableC10637pL0(ReactApplicationContext reactApplicationContext, String str, String str2, int i, int i2, String str3) {
        this.f40021a = reactApplicationContext;
        this.f40022b = str;
        this.f40023c = str2;
        this.f40024d = i;
        this.f40025e = i2;
        this.f40026f = str3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        C11913zL0 c11913zL0 = new C11913zL0(this.f40021a);
        String str = this.f40023c;
        String str2 = this.f40026f;
        ReactApplicationContext reactApplicationContext = C11277uL0.f43672b;
        String str3 = this.f40022b;
        String strM157b = AL0.m157b(str3);
        if (strM157b != null) {
            str3 = strM157b;
        }
        try {
            int i = str.equalsIgnoreCase("base64") ? 4095 : 4096;
            int i2 = this.f40024d;
            if (i2 > 0) {
                i = i2;
            }
            InputStream inputStreamOpenInputStream = (strM157b == null || !str3.startsWith("bundle-assets://")) ? strM157b == null ? C11277uL0.f43672b.getContentResolver().openInputStream(Uri.parse(str3)) : new FileInputStream(new File(str3)) : C11277uL0.f43672b.getAssets().open(str3.replace("bundle-assets://", ""));
            boolean zEqualsIgnoreCase = str.equalsIgnoreCase("utf8");
            int i3 = this.f40025e;
            int i4 = -1;
            int i5 = 0;
            if (zEqualsIgnoreCase) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpenInputStream, Charset.forName("UTF-8"));
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader, i);
                char[] cArr = new char[i];
                while (true) {
                    int i6 = bufferedReader.read(cArr, i5, i);
                    if (i6 == i4) {
                        break;
                    }
                    c11913zL0.m26376b(str2, "data", new String(cArr, i5, i6));
                    if (i3 > 0) {
                        SystemClock.sleep(i3);
                    }
                    i4 = -1;
                    i5 = 0;
                }
                bufferedReader.close();
                inputStreamReader.close();
            } else if (str.equalsIgnoreCase("ascii")) {
                byte[] bArr = new byte[i];
                while (true) {
                    int i7 = inputStreamOpenInputStream.read(bArr);
                    if (i7 == -1) {
                        break;
                    }
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    for (int i8 = 0; i8 < i7; i8++) {
                        writableArrayCreateArray.pushInt(bArr[i8]);
                    }
                    c11913zL0.m26375a(str2, writableArrayCreateArray);
                    if (i3 > 0) {
                        SystemClock.sleep(i3);
                    }
                }
            } else {
                if (!str.equalsIgnoreCase("base64")) {
                    c11913zL0.m26377c(str2, "EINVAL", "Unrecognized encoding `" + str + "`, should be one of `base64`, `utf8`, `ascii`");
                    inputStreamOpenInputStream.close();
                }
                byte[] bArr2 = new byte[i];
                while (true) {
                    int i9 = inputStreamOpenInputStream.read(bArr2);
                    if (i9 == -1) {
                        break;
                    }
                    if (i9 < i) {
                        byte[] bArr3 = new byte[i9];
                        System.arraycopy(bArr2, 0, bArr3, 0, i9);
                        c11913zL0.m26376b(str2, "data", Base64.encodeToString(bArr3, 2));
                    } else {
                        c11913zL0.m26376b(str2, "data", Base64.encodeToString(bArr2, 2));
                    }
                    if (i3 > 0) {
                        SystemClock.sleep(i3);
                    }
                }
            }
            c11913zL0.m26376b(str2, "end", "");
            inputStreamOpenInputStream.close();
        } catch (FileNotFoundException unused) {
            c11913zL0.m26377c(str2, "ENOENT", AbstractC7222ym.m26234k("No such file '", str3, "'"));
        } catch (Exception e) {
            c11913zL0.m26377c(str2, "EUNSPECIFIED", AbstractC7222ym.m26234k("Failed to convert data to ", str, " encoded string. This might be because this encoding cannot be used for this data."));
            e.printStackTrace();
        }
    }
}
