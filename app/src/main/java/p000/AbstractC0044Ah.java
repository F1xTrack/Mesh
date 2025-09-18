package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* renamed from: Ah */
/* loaded from: classes.dex */
public abstract class AbstractC0044Ah {
    /* renamed from: a */
    public static void m282a(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
        biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
    }

    /* renamed from: b */
    public static void m283b(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
        biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
    }

    /* renamed from: c */
    public static BiometricPrompt m284c(BiometricPrompt.Builder builder) {
        return builder.build();
    }

    /* renamed from: d */
    public static BiometricPrompt.Builder m285d(Context context) {
        return new BiometricPrompt.Builder(context);
    }

    /* renamed from: e */
    public static void m286e(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    /* renamed from: f */
    public static void m287f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
        builder.setNegativeButton(charSequence, executor, onClickListener);
    }

    /* renamed from: g */
    public static void m288g(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* renamed from: h */
    public static void m289h(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
