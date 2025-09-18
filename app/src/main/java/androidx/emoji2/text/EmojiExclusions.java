package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
class EmojiExclusions {

    public static class EmojiExclusions_Api34 {
        private EmojiExclusions_Api34() {
        }

        public static Set<int[]> getExclusions() {
            return EmojiExclusions_Reflections.getExclusions();
        }
    }

    public static class EmojiExclusions_Reflections {
        private EmojiExclusions_Reflections() {
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static Set<int[]> getExclusions() {
            try {
                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (objInvoke == null) {
                    return Collections.emptySet();
                }
                Set<int[]> set = (Set) objInvoke;
                Iterator<int[]> it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    private EmojiExclusions() {
    }

    public static Set<int[]> getEmojiExclusions() {
        return Build.VERSION.SDK_INT >= 34 ? EmojiExclusions_Api34.getExclusions() : EmojiExclusions_Reflections.getExclusions();
    }
}
