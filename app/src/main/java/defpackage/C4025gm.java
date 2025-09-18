package defpackage;

import android.app.PendingIntent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.crypto.CryptoConfig;
import com.facebook.crypto.keychain.KeyChain;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: gm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4025gm implements KeyChain {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;

    public C4025gm(ReactApplicationContext reactApplicationContext, CryptoConfig cryptoConfig) {
        this.d = reactApplicationContext.getSharedPreferences(cryptoConfig == CryptoConfig.KEY_128 ? "crypto" : "crypto.".concat(String.valueOf(cryptoConfig)), 0);
        this.e = new NV();
        this.c = cryptoConfig;
    }

    public C2033Zv0 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.g;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                MQ0 mq0 = (MQ0) it.next();
                mq0.getClass();
                arrayList2.add(mq0);
            }
        }
        MQ0[] mq0Arr = arrayList.isEmpty() ? null : (MQ0[]) arrayList.toArray(new MQ0[arrayList.size()]);
        return new C2033Zv0((IconCompat) this.c, (CharSequence) this.d, (PendingIntent) this.e, (Bundle) this.f, arrayList2.isEmpty() ? null : (MQ0[]) arrayList2.toArray(new MQ0[arrayList2.size()]), mq0Arr, this.a, this.b);
    }

    public byte[] b(int i, String str) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        String string = sharedPreferences.getString(str, null);
        if (string != null) {
            return Base64.decode(string, 0);
        }
        byte[] bArr = new byte[i];
        ((NV) this.e).nextBytes(bArr);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(str, Base64.encodeToString(bArr, 0));
        editorEdit.commit();
        return bArr;
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public synchronized void destroyKeys() {
        try {
            this.a = false;
            this.b = false;
            byte[] bArr = (byte[]) this.f;
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
            }
            byte[] bArr2 = (byte[]) this.g;
            if (bArr2 != null) {
                Arrays.fill(bArr2, (byte) 0);
            }
            this.f = null;
            this.g = null;
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.d).edit();
            editorEdit.remove("cipher_key");
            editorEdit.remove("mac_key");
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public synchronized byte[] getCipherKey() {
        try {
            if (!this.a) {
                this.f = b(((CryptoConfig) this.c).keyLength, "cipher_key");
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
        return (byte[]) this.f;
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public byte[] getMacKey() {
        if (!this.b) {
            this.g = b(64, "mac_key");
        }
        this.b = true;
        return (byte[]) this.g;
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public byte[] getNewIV() {
        byte[] bArr = new byte[((CryptoConfig) this.c).ivLength];
        ((NV) this.e).nextBytes(bArr);
        return bArr;
    }

    public C4025gm(C6329om c6329om, ExecutorC5715lY0 executorC5715lY0) {
        this.a = false;
        this.b = false;
        this.e = new Object();
        this.f = new C2580cn(0);
        this.c = c6329om;
        this.d = executorC5715lY0;
    }

    public C4025gm(String str, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this.a = true;
        this.b = true;
        this.c = null;
        this.d = C3865fw0.b(str);
        this.e = pendingIntent;
        this.f = bundle;
        this.g = null;
        this.a = true;
        this.b = true;
    }
}
