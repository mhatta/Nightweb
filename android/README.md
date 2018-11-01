## Build Instructions

1. Install JDK
	- If you use apt-get, just type `sudo apt-get install default-jdk`
	- Tested with openjdk-11-jdk on Debian sid
2. Download the [Android SDK](http://developer.android.com/sdk/index.html)
	- Just the SDK Tools; you don't need the bundle
	- On Debian, `sudo apt-get install android-sdk android-sdk-platform-23`
	- On Debian, you also need to install `google-android-m2repository-installer` in `contrib`
	- You might have to symlink `/usr/share/java/com.android.tools.annotations.jar` in `libandroid-tools-annotations-java` to `/usr/lib/android-sdk/tools/support/annotations.jar` by hand
3. Install [Leiningen](https://github.com/technomancy/leiningen)
	- The version in your package manager may be out of date
	- I recommend the manual installation they describe in their README
	- Tested with leiningen 2.8.1-9
4. Create or modify `~/.lein/profiles.clj` so it looks like this:

```clojure
{:user {
    :plugins [[lein-droid "x.x.x"]]
    :android {:sdk-path "path/to/android-sdk-linux"
              :force-dex-optimize true}
}}
```

	- `sdk-path` is `/usr/lib/android-sdk` on Debian

Replace the "x.x.x" with the version below:

![](https://clojars.org/lein-droid/latest-version.svg)

Read the [lein-droid tutorial](https://github.com/clojure-android/lein-droid/wiki/Tutorial) to learn the commands.

Basically, what you need to run is `lein droid doall`.

5. `lein-droid` 0.4.6 doesn't work with leiningen 2.8.  There is a fix, but not incorporated into the upstream yet.  You need to update it manually.

```bash
$ git clone git@github.com:ne-sachirou/lein-droid.git
$ cd lein-droid
$ git checkout -b fix/for_latest_leiningen origin/fix/for_latest_leiningen
$ lein install
```
