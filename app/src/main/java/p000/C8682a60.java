package p000;

import android.content.SharedPreferences;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import kotlin.KotlinVersion;

/* renamed from: a60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8682a60 {

    /* renamed from: c */
    public static final String[] f15310c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    public final SharedPreferences f15311a;

    /* renamed from: b */
    public final String f15312b;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8682a60(p000.C0786MU r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.m5379a()
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.Context r2 = r4.f7174a
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)
            r3.f15311a = r0
            r4.m5379a()
            fV r0 = r4.f7176c
            java.lang.String r1 = r0.f27222e
            if (r1 == 0) goto L1b
            goto L48
        L1b:
            r4.m5379a()
            java.lang.String r4 = "1:"
            java.lang.String r1 = r0.f27219b
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            java.lang.String r4 = "2:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            goto L48
        L31:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r1.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3e
        L3c:
            r1 = r2
            goto L48
        L3e:
            r0 = 1
            r1 = r4[r0]
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L48
            goto L3c
        L48:
            r3.f15312b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8682a60.<init>(MU):void");
    }

    /* renamed from: a */
    public final String m9672a() {
        String string;
        synchronized (this.f15311a) {
            string = this.f15311a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: b */
    public final String m9673b() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f15311a) {
            String strEncodeToString = null;
            String string = this.f15311a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                e.toString();
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & KotlinVersion.MAX_COMPONENT_VALUE);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
            }
            return strEncodeToString;
        }
    }
}
