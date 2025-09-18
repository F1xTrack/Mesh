package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: classes.dex */
public abstract class YJ1 {
    public static final int[] a = {R.attr.stateListAnimator};

    public static byte[] a(char[] cArr, byte[] bArr, int i, boolean z) {
        try {
            return (z ? SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256") : SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")).generateSecret(new PBEKeySpec(cArr, bArr, 10000, i)).getEncoded();
        } catch (NoSuchAlgorithmException e) {
            e = e;
            e.getMessage();
            return new byte[0];
        } catch (InvalidKeySpecException e2) {
            e = e2;
            e.getMessage();
            return new byte[0];
        }
    }

    public static void b(C3708f6 c3708f6, float f) {
        int integer = c3708f6.getResources().getInteger(ru.mes.dnevnik.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, ru.mes.dnevnik.R.attr.state_liftable, -2130969641}, ObjectAnimator.ofFloat(c3708f6, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(c3708f6, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(c3708f6, "elevation", 0.0f).setDuration(0L));
        c3708f6.setStateListAnimator(stateListAnimator);
    }
}
