package p000;

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

/* renamed from: gm */
/* loaded from: classes.dex */
public final class C4137gm implements KeyChain {

    /* renamed from: a */
    public boolean f27979a;

    /* renamed from: b */
    public boolean f27980b;

    /* renamed from: c */
    public final Object f27981c;

    /* renamed from: d */
    public final Object f27982d;

    /* renamed from: e */
    public final Object f27983e;

    /* renamed from: f */
    public Object f27984f;

    /* renamed from: g */
    public Object f27985g;

    public C4137gm(ReactApplicationContext reactApplicationContext, CryptoConfig cryptoConfig) {
        this.f27982d = reactApplicationContext.getSharedPreferences(cryptoConfig == CryptoConfig.KEY_128 ? "crypto" : "crypto.".concat(String.valueOf(cryptoConfig)), 0);
        this.f27983e = new C0850NV();
        this.f27981c = cryptoConfig;
    }

    /* renamed from: a */
    public C8656Zv0 m18637a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.f27985g;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                MQ0 mq0 = (MQ0) it.next();
                mq0.getClass();
                arrayList2.add(mq0);
            }
        }
        MQ0[] mq0Arr = arrayList.isEmpty() ? null : (MQ0[]) arrayList.toArray(new MQ0[arrayList.size()]);
        return new C8656Zv0((IconCompat) this.f27981c, (CharSequence) this.f27982d, (PendingIntent) this.f27983e, (Bundle) this.f27984f, arrayList2.isEmpty() ? null : (MQ0[]) arrayList2.toArray(new MQ0[arrayList2.size()]), mq0Arr, this.f27979a, this.f27980b);
    }

    /* renamed from: b */
    public byte[] m18638b(int i, String str) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f27982d;
        String string = sharedPreferences.getString(str, null);
        if (string != null) {
            return Base64.decode(string, 0);
        }
        byte[] bArr = new byte[i];
        ((C0850NV) this.f27983e).nextBytes(bArr);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(str, Base64.encodeToString(bArr, 0));
        editorEdit.commit();
        return bArr;
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public synchronized void destroyKeys() {
        try {
            this.f27979a = false;
            this.f27980b = false;
            byte[] bArr = (byte[]) this.f27984f;
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
            }
            byte[] bArr2 = (byte[]) this.f27985g;
            if (bArr2 != null) {
                Arrays.fill(bArr2, (byte) 0);
            }
            this.f27984f = null;
            this.f27985g = null;
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f27982d).edit();
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
            if (!this.f27979a) {
                this.f27984f = m18638b(((CryptoConfig) this.f27981c).keyLength, "cipher_key");
            }
            this.f27979a = true;
        } catch (Throwable th) {
            throw th;
        }
        return (byte[]) this.f27984f;
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public byte[] getMacKey() {
        if (!this.f27980b) {
            this.f27985g = m18638b(64, "mac_key");
        }
        this.f27980b = true;
        return (byte[]) this.f27985g;
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public byte[] getNewIV() {
        byte[] bArr = new byte[((CryptoConfig) this.f27981c).ivLength];
        ((C0850NV) this.f27983e).nextBytes(bArr);
        return bArr;
    }

    public C4137gm(C6573om c6573om, ExecutorC10151lY0 executorC10151lY0) {
        this.f27979a = false;
        this.f27980b = false;
        this.f27983e = new Object();
        this.f27984f = new C1869cn(0);
        this.f27981c = c6573om;
        this.f27982d = executorC10151lY0;
    }

    public C4137gm(String str, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this.f27979a = true;
        this.f27980b = true;
        this.f27981c = null;
        this.f27982d = C9431fw0.m18310b(str);
        this.f27983e = pendingIntent;
        this.f27984f = bundle;
        this.f27985g = null;
        this.f27979a = true;
        this.f27980b = true;
    }
}
