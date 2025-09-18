package com.leerman.rnsecuritypack;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import kotlin.Metadata;
import p000.AX0;
import p000.C0779MN;
import p000.C10909rT0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m22267d2 = {"Lcom/leerman/rnsecuritypack/SecurityPackModule;", "Lcom/leerman/rnsecuritypack/SecurityPackSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTf1;", "isRooted", "(Lcom/facebook/react/bridge/Promise;)V", "getSignatures", "", "bytes", "bytesToHex", "([B)Ljava/lang/String;", "mContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Companion", "AX0", "react-native-security-pack_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SecurityPackModule extends SecurityPackSpec {
    public static final AX0 Companion = new AX0();
    public static final String NAME = "SecurityPack";
    private final ReactApplicationContext mContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityPackModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "context");
        this.mContext = reactApplicationContext;
    }

    public final String bytesToHex(byte[] bytes) {
        O90.m5968f(bytes, "bytes");
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bytes.length * 2];
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            byte b = bytes[i];
            int i2 = i * 2;
            cArr2[i2] = cArr[(b & 255) >>> 4];
            cArr2[i2 + 1] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.leerman.rnsecuritypack.SecurityPackSpec
    @ReactMethod
    public void getSignatures(Promise promise) throws NoSuchAlgorithmException {
        ArrayList arrayList;
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            String packageName = this.mContext.getPackageName();
            int i = 0;
            if (Build.VERSION.SDK_INT >= 28) {
                SigningInfo signingInfo = this.mContext.getPackageManager().getPackageInfo(packageName, 134217728).signingInfo;
                if (signingInfo.hasMultipleSigners()) {
                    Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                    O90.m5967e(apkContentsSigners, "getApkContentsSigners(...)");
                    arrayList = new ArrayList(apkContentsSigners.length);
                    int length = apkContentsSigners.length;
                    while (i < length) {
                        Signature signature = apkContentsSigners[i];
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                        messageDigest.update(signature.toByteArray());
                        byte[] bArrDigest = messageDigest.digest();
                        O90.m5967e(bArrDigest, "digest(...)");
                        arrayList.add(bytesToHex(bArrDigest));
                        i++;
                    }
                } else {
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    O90.m5967e(signingCertificateHistory, "getSigningCertificateHistory(...)");
                    arrayList = new ArrayList(signingCertificateHistory.length);
                    int length2 = signingCertificateHistory.length;
                    while (i < length2) {
                        Signature signature2 = signingCertificateHistory[i];
                        MessageDigest messageDigest2 = MessageDigest.getInstance("SHA");
                        messageDigest2.update(signature2.toByteArray());
                        byte[] bArrDigest2 = messageDigest2.digest();
                        O90.m5967e(bArrDigest2, "digest(...)");
                        arrayList.add(bytesToHex(bArrDigest2));
                        i++;
                    }
                }
            } else {
                Signature[] signatureArr = this.mContext.getPackageManager().getPackageInfo(packageName, 64).signatures;
                O90.m5965c(signatureArr);
                arrayList = new ArrayList(signatureArr.length);
                int length3 = signatureArr.length;
                while (i < length3) {
                    Signature signature3 = signatureArr[i];
                    MessageDigest messageDigest3 = MessageDigest.getInstance("SHA");
                    messageDigest3.update(signature3.toByteArray());
                    byte[] bArrDigest3 = messageDigest3.digest();
                    O90.m5967e(bArrDigest3, "digest(...)");
                    arrayList.add(bytesToHex(bArrDigest3));
                    i++;
                }
            }
            promise.resolve(Arguments.fromList(arrayList));
        } catch (Exception unused) {
        }
        promise.resolve(Arguments.fromList(C0779MN.f7117a));
    }

    @Override // com.leerman.rnsecuritypack.SecurityPackSpec
    @ReactMethod
    public void isRooted(Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            promise.resolve(Boolean.valueOf(new C10909rT0(this.mContext).m24354d()));
        } catch (Throwable unused) {
            promise.resolve(Boolean.FALSE);
        }
    }
}
