## [1.0.3](https://github.com/position-pal/scala-template/compare/1.0.2...1.0.3) (2025-01-17)

### Dependency updates

* **core-deps:** update dependency org.scala-lang:scala3-library_3 to v3.6.3 ([#99](https://github.com/position-pal/scala-template/issues/99)) ([2cf294c](https://github.com/position-pal/scala-template/commit/2cf294cf7956ff9193b24075888c486879fa8d68))
* **deps:** update dependency gradle to v8.12 ([#88](https://github.com/position-pal/scala-template/issues/88)) ([6e7d249](https://github.com/position-pal/scala-template/commit/6e7d24985770a9f424c3e76393e4a203a31e7b40))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.117 ([#89](https://github.com/position-pal/scala-template/issues/89)) ([624d20b](https://github.com/position-pal/scala-template/commit/624d20bfdc286757d402e6ce536bfa518f4abb4d))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.118 ([#96](https://github.com/position-pal/scala-template/issues/96)) ([bab3dbb](https://github.com/position-pal/scala-template/commit/bab3dbb310a6c762f10124787d6b18d2d1149337))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.119 ([#97](https://github.com/position-pal/scala-template/issues/97)) ([f71cac7](https://github.com/position-pal/scala-template/commit/f71cac72f5d291e0fa1eabfd8dab975a970c128a))
* **deps:** update junit5 monorepo to v1.11.4 ([#85](https://github.com/position-pal/scala-template/issues/85)) ([37b3fa8](https://github.com/position-pal/scala-template/commit/37b3fa8f83545327c220082973e4ba7c5d60cfd6))
* **deps:** update node.js to 22.13 ([#95](https://github.com/position-pal/scala-template/issues/95)) ([8f6f752](https://github.com/position-pal/scala-template/commit/8f6f7522657be87a428cd0fab38e97f3d719b810))
* **deps:** update plugin com.gradle.develocity to v3.19 ([#83](https://github.com/position-pal/scala-template/issues/83)) ([8bc57a9](https://github.com/position-pal/scala-template/commit/8bc57a959b6e2f31423029617159ee6f7e738422))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.17 ([#87](https://github.com/position-pal/scala-template/issues/87)) ([e7a6d26](https://github.com/position-pal/scala-template/commit/e7a6d264c0febb052f5ba2ba67600252f8fadc0d))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.18 ([#90](https://github.com/position-pal/scala-template/issues/90)) ([da4099f](https://github.com/position-pal/scala-template/commit/da4099f3f5582c3eb8caaab250b73838ad1380b3))
* **deps:** update plugin scala-extras to v3.1.3 ([#92](https://github.com/position-pal/scala-template/issues/92)) ([0de60ac](https://github.com/position-pal/scala-template/commit/0de60ac031232173ef7fd18d6e372a86a9a1f42a))

### Build and continuous integration

* aggregate delivery-related jobs in a single workflow file and scaladoc generation ([#79](https://github.com/position-pal/scala-template/issues/79)) ([676d8f5](https://github.com/position-pal/scala-template/commit/676d8f566a027f4bdb04aa59231f1c33ab4f68ea))
* checkout tags in scaladoc stage and use position-pal bot token to release ([#91](https://github.com/position-pal/scala-template/issues/91)) ([4d0a43f](https://github.com/position-pal/scala-template/commit/4d0a43f7224aab61ef5de21d7f3d60d2442715c3))
* **deps:** pin jamesives/github-pages-deploy-action action to 15de0f0 ([#80](https://github.com/position-pal/scala-template/issues/80)) ([c993336](https://github.com/position-pal/scala-template/commit/c993336a9bba24f8b16e11fd0516867f0f4120c5))
* **deps:** update actions/setup-java digest to 7a6d8a8 ([#86](https://github.com/position-pal/scala-template/issues/86)) ([f2c20df](https://github.com/position-pal/scala-template/commit/f2c20df310bc33fdfde7d12c75bd5e19843ee526))
* **deps:** update andreasaugustin/actions-template-sync digest to cf88b4e ([#93](https://github.com/position-pal/scala-template/issues/93)) ([d237d28](https://github.com/position-pal/scala-template/commit/d237d28892bc490109fc51a2c8d56003ff7b132b))
* **deps:** update docker/build-push-action digest to 67a2d40 ([#98](https://github.com/position-pal/scala-template/issues/98)) ([d3cf4ca](https://github.com/position-pal/scala-template/commit/d3cf4ca24962c62596d2038989ff0940af2682a0))
* **deps:** update docker/build-push-action digest to b32b51a ([#94](https://github.com/position-pal/scala-template/issues/94)) ([148ff85](https://github.com/position-pal/scala-template/commit/148ff85b5df15d1579f9023298f8e515ee82d3cd))
* **deps:** update docker/setup-buildx-action digest to 6524bf6 ([#84](https://github.com/position-pal/scala-template/issues/84)) ([36a9883](https://github.com/position-pal/scala-template/commit/36a9883bbce6aa6c5513f482eba94aa7f171df28))
* fix `is_force_push_pr` parameter position, add `pr_title` and custom github token ([1704571](https://github.com/position-pal/scala-template/commit/17045714c59ab1d6760c7a85ad7f3332fe56eab7))
* fix cron job to run daily at 00:00 instead of at 00:00 on day-of-month 1 ([c1cf991](https://github.com/position-pal/scala-template/commit/c1cf9912dc860d7f21d27531cf31dbcb87480afb))
* ignore all core submodule modifications for template sync ([43e9785](https://github.com/position-pal/scala-template/commit/43e9785f62ebce371cca32b776ee67d225bbbbe4))
* remove useless dependency ([0ed53db](https://github.com/position-pal/scala-template/commit/0ed53dbf07aaad7a6d0c74607b41ec4d60b29e8c))

### Refactoring

* **build:** use `==` instead of `equals` ([bed5981](https://github.com/position-pal/scala-template/commit/bed59813fcc65ef5f6630116d7d5860de5108250))

## [1.0.2](https://github.com/position-pal/scala-template/compare/1.0.1...1.0.2) (2024-12-10)

### Dependency updates

* **core-deps:** update dependency org.scala-lang:scala3-library_3 to v3.6.2 ([#78](https://github.com/position-pal/scala-template/issues/78)) ([8463db6](https://github.com/position-pal/scala-template/commit/8463db6dc0ab406883250f2b23f4a179fada870c))
* **deps:** update dependency gradle to v8.11 ([#66](https://github.com/position-pal/scala-template/issues/66)) ([bef3cd9](https://github.com/position-pal/scala-template/commit/bef3cd9e3af9f87a9464d46cd02858b65e10fdc3))
* **deps:** update dependency gradle to v8.11.1 ([#70](https://github.com/position-pal/scala-template/issues/70)) ([935b288](https://github.com/position-pal/scala-template/commit/935b288ac9582e4a5913f3b1e8f5f83b5b7eba3f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.112 ([f46586b](https://github.com/position-pal/scala-template/commit/f46586b9f283e9919cf40e25a03eabfd70df8ccd))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.113 ([4134d3f](https://github.com/position-pal/scala-template/commit/4134d3f2e45852f47eaee3b2331fa43c9ac406ca))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.114 ([15aa398](https://github.com/position-pal/scala-template/commit/15aa39832842c16e8394b5a99f7a0451c03b18ca))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.115 ([#67](https://github.com/position-pal/scala-template/issues/67)) ([4ada8d2](https://github.com/position-pal/scala-template/commit/4ada8d232cf8ba160e99b350bb0fce805d0f4dce))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.116 ([#76](https://github.com/position-pal/scala-template/issues/76)) ([5585e14](https://github.com/position-pal/scala-template/commit/5585e14962b552a8eed3f1f7eb6d6458e9678bf6))
* **deps:** update junit5 monorepo to v1.11.3 ([dc789d1](https://github.com/position-pal/scala-template/commit/dc789d1991549a72ccf8b5f82108618444f4d416))
* **deps:** update node.js to 22.12 ([#75](https://github.com/position-pal/scala-template/issues/75)) ([b691f69](https://github.com/position-pal/scala-template/commit/b691f6959d50fa23f2178e559b7c7635a5ae1d6f))
* **deps:** update node.js to v22 ([c66e47c](https://github.com/position-pal/scala-template/commit/c66e47c65d75b1e9f48d81470abd8406ef19a598))
* **deps:** update plugin com.gradle.develocity to v3.18.2 ([#68](https://github.com/position-pal/scala-template/issues/68)) ([409cc76](https://github.com/position-pal/scala-template/commit/409cc7678b390fa1a50953424252113f84148a3e))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.15 ([#71](https://github.com/position-pal/scala-template/issues/71)) ([741607f](https://github.com/position-pal/scala-template/commit/741607f6860ababd7564eeb3ef720dbb843e14a7))
* **deps:** update plugin scala-extras to v3 ([#77](https://github.com/position-pal/scala-template/issues/77)) ([6572a53](https://github.com/position-pal/scala-template/commit/6572a53bacc0d67f70caebc94457bc7af1b9488f))

### Build and continuous integration

* add build utilities to conditionally perform an action in the build configuration phase and setting envs ([6ac131c](https://github.com/position-pal/scala-template/commit/6ac131c7a8f6ad8eacd0ece525dae889eba6ff10))
* add explanatory comment on why the dispatcher must be on a separate file ([6ed2d9a](https://github.com/position-pal/scala-template/commit/6ed2d9a2a4a1ba18ae0d85cc660d36927599d656))
* **deps:** pin dependencies ([#74](https://github.com/position-pal/scala-template/issues/74)) ([0c81c43](https://github.com/position-pal/scala-template/commit/0c81c43aee76f422dd0a94d99ec2214c5bbd9531))
* **deps:** update actions/checkout digest to 11bd719 ([8cefc6d](https://github.com/position-pal/scala-template/commit/8cefc6d5c33d5d1f8316cc21947dcc8309d46f86))
* **deps:** update actions/setup-java digest to 8df1039 ([5a1c60b](https://github.com/position-pal/scala-template/commit/5a1c60b11eb259ed5856252ed6a7d4818f0066ef))
* **deps:** update actions/setup-node action to v4.1.0 ([698390b](https://github.com/position-pal/scala-template/commit/698390b03834e006218b88dadbebfd000a16a4a2))
* docker and template updater ([#69](https://github.com/position-pal/scala-template/issues/69)) ([9de455f](https://github.com/position-pal/scala-template/commit/9de455fa4f32c432234e30e7d5a50b18d1ba353a))

## [1.0.1](https://github.com/position-pal/scala-template/compare/1.0.0...1.0.1) (2024-10-20)

### Dependency updates

* **core-deps:** update dependency org.scala-lang:scala3-library_3 to v3.6.1 ([a405308](https://github.com/position-pal/scala-template/commit/a405308f010f891be007192229f427abdde6973c))
* **deps:** update dependency gradle to v8.10 ([683926c](https://github.com/position-pal/scala-template/commit/683926c8b9d9fe08cb83832cedbd86e7d784d852))
* **deps:** update dependency gradle to v8.10.1 ([34dfba9](https://github.com/position-pal/scala-template/commit/34dfba945d0e67e3e3a6502d00697601e43abb1a))
* **deps:** update dependency gradle to v8.10.2 ([8d93e77](https://github.com/position-pal/scala-template/commit/8d93e77979aa1ce82c5b46538424b055f1c1d1df))
* **deps:** update dependency gradle to v8.9 ([aa212d3](https://github.com/position-pal/scala-template/commit/aa212d37f3e27fc120c3491e6cd827974195552b))
* **deps:** update dependency org.scala-lang:scala3-library_3 to v3.5.0 ([2978152](https://github.com/position-pal/scala-template/commit/297815204a44dcfec0832894f5885eda2295efa5))
* **deps:** update dependency org.scala-lang:scala3-library_3 to v3.5.1 ([bcff6b0](https://github.com/position-pal/scala-template/commit/bcff6b0ef0008a0764de0c91ea066117030273dd))
* **deps:** update dependency org.scala-lang:scala3-library_3 to v3.5.2 ([3703086](https://github.com/position-pal/scala-template/commit/3703086c7d1808155d68e0ecda1131488d0e83bc))
* **deps:** update dependency org.scalatest:scalatest_3 to v3.3.0-snap4 ([d89d7e4](https://github.com/position-pal/scala-template/commit/d89d7e4576b73484c9c0b02376210f569f4254c3))
* **deps:** update dependency org.scalatestplus:junit-5-10_3 to v3.2.19.1 ([02cb33f](https://github.com/position-pal/scala-template/commit/02cb33fc0356d807be9aa68908ceec46ec8dc43b))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.101 ([035f29c](https://github.com/position-pal/scala-template/commit/035f29c0493121785a4c3a6be815296578f1d2f3))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.102 ([7fb8be0](https://github.com/position-pal/scala-template/commit/7fb8be0dfc83b4841518e0b4a1a6f2fcd61d7191))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.103 ([fec27f1](https://github.com/position-pal/scala-template/commit/fec27f1dd3e080824623ed69da981a6f54fa0bdb))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.104 ([ae696c1](https://github.com/position-pal/scala-template/commit/ae696c189322379c995320fdde38fd5ecf72656f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.105 ([ed4801d](https://github.com/position-pal/scala-template/commit/ed4801dc3ca0c86ce0936f9f2341b5eadd610330))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.106 ([4dceec9](https://github.com/position-pal/scala-template/commit/4dceec9765f437bfdc05f59ac488d97b9b3549e7))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.107 ([bd57c26](https://github.com/position-pal/scala-template/commit/bd57c2672ee6eaa426fe3b9446fb03dea39f4b96))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.108 ([2fbc7fd](https://github.com/position-pal/scala-template/commit/2fbc7fdd4b786fc3c821d16ff8ac01edd6f26930))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.109 ([84c4b18](https://github.com/position-pal/scala-template/commit/84c4b189ff4d92fb486592f1f6bfb2adc17b4d54))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.110 ([af71cac](https://github.com/position-pal/scala-template/commit/af71cac0c2eb5205957b48459882fb5ad71e532c))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.111 ([8df7589](https://github.com/position-pal/scala-template/commit/8df7589ae5cea4abd24af52860665a3b912b9a92))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.91 ([9c1f8dc](https://github.com/position-pal/scala-template/commit/9c1f8dc110ecc33cf24e01fa5968bffd63031be2))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.92 ([28dfc46](https://github.com/position-pal/scala-template/commit/28dfc461b9eb5bfaed2d4fcc11095c2f8ae9c9cc))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.93 ([c32b99c](https://github.com/position-pal/scala-template/commit/c32b99c8b90384b645155744a18007b6fe734339))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.94 ([8741f97](https://github.com/position-pal/scala-template/commit/8741f9790027eaa5e2b501e39221acb4c7e59b3e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.95 ([fe91804](https://github.com/position-pal/scala-template/commit/fe918047c2b6c3d4ac7bdeb325df71dcea2fb52e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.96 ([51467f0](https://github.com/position-pal/scala-template/commit/51467f08519648303baab4610ebc419f42a4a22e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.98 ([370d8cd](https://github.com/position-pal/scala-template/commit/370d8cd3a41d7b7524cd201b5b34d76ea94c59c8))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.99 ([b43680b](https://github.com/position-pal/scala-template/commit/b43680b3f00669fccc727f3dfcf4da5730b10fc4))
* **deps:** update junit5 monorepo to v1.11.0 ([5e813a5](https://github.com/position-pal/scala-template/commit/5e813a56b53e913af567d4deb60114f81866a954))
* **deps:** update junit5 monorepo to v1.11.1 ([4109dff](https://github.com/position-pal/scala-template/commit/4109dffa27eb9a1b0855821246ca10f8ee29da25))
* **deps:** update junit5 monorepo to v1.11.2 ([b52cb6c](https://github.com/position-pal/scala-template/commit/b52cb6c3c4c27f28e4d4c9578eef2d4da826b986))
* **deps:** update node.js to 20.16 ([ca579c9](https://github.com/position-pal/scala-template/commit/ca579c9b8219bd469fba73b2781ca1555f692032))
* **deps:** update node.js to 20.17 ([20c5eb6](https://github.com/position-pal/scala-template/commit/20c5eb69b2b33d4022d38360cd83469c25beac64))
* **deps:** update node.js to 20.18 ([bd5a56f](https://github.com/position-pal/scala-template/commit/bd5a56f76e61d12853291a7eecd440b70f5e214e))
* **deps:** update plugin com.gradle.develocity to v3.17.6 ([1f8455b](https://github.com/position-pal/scala-template/commit/1f8455b1415cf0347ca5ebfab6c667937ddc6376))
* **deps:** update plugin com.gradle.develocity to v3.18 ([ea3422d](https://github.com/position-pal/scala-template/commit/ea3422d4ddc8574d60977604fc4d178e6e5b5bbc))
* **deps:** update plugin com.gradle.develocity to v3.18.1 ([1a12ba9](https://github.com/position-pal/scala-template/commit/1a12ba98f676eea7be463046c2f2b4b46d53aab7))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.12 ([b89f7b8](https://github.com/position-pal/scala-template/commit/b89f7b8071a033fa18d85bea02994b14354fed65))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.13 ([646ada2](https://github.com/position-pal/scala-template/commit/646ada2d7ededdf3c886e97ab11dc1e03b910dcf))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.8 ([532d8c5](https://github.com/position-pal/scala-template/commit/532d8c56fd743d903e9cba715af8c2ca4e0a7528))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.9 ([35626c3](https://github.com/position-pal/scala-template/commit/35626c3c857e1ffc93e649fd1c15eaa538afe5f8))
* **deps:** update plugin scala-extras to v2.1.0 ([10910fd](https://github.com/position-pal/scala-template/commit/10910fdb7994a2738e7065e81f9169dca6456051))
* **deps:** update plugin scala-extras to v2.1.1 ([5ab2824](https://github.com/position-pal/scala-template/commit/5ab2824eb91515b69cead5aabf0f15186349796a))
* **deps:** update plugin scala-extras to v2.1.2 ([62b7210](https://github.com/position-pal/scala-template/commit/62b721044bc5f99a3813bd551535e4a4a796211c))
* **deps:** update plugin scala-extras to v2.1.3 ([df41d67](https://github.com/position-pal/scala-template/commit/df41d67e9ff9cf06f270a1397902d9f73f496d81))
* **deps:** update plugin scala-extras to v2.1.4 ([c23a4de](https://github.com/position-pal/scala-template/commit/c23a4de0f816ee421f44356cb3f8b2ecf0bb5e45))

### Build and continuous integration

* add dispatcher ([8081c2a](https://github.com/position-pal/scala-template/commit/8081c2a3e64416230a181d2c2d5d41e60fec407f))
* add inspect step ([ff530c4](https://github.com/position-pal/scala-template/commit/ff530c43dd39d1666ac5ad8eddda6d9905dd9e32))
* **deps:** update actions/checkout digest to eef6144 ([11e5177](https://github.com/position-pal/scala-template/commit/11e5177ba0f9457bcee143218ebb978ff11a08fb))
* **deps:** update actions/setup-java digest to 2dfa201 ([d76b728](https://github.com/position-pal/scala-template/commit/d76b7282f5adb6c210c7b3757317282bb7b1e40b))
* **deps:** update actions/setup-java digest to 6a0805f ([1b1ef71](https://github.com/position-pal/scala-template/commit/1b1ef71f68015bd857f2a1b24836d380a3c4f1d7))
* **deps:** update actions/setup-java digest to b36c23c ([b95bdf5](https://github.com/position-pal/scala-template/commit/b95bdf569e13cf8c2995b42afc2b2aaba934db14))
* **deps:** update actions/setup-node action to v4.0.3 ([7355542](https://github.com/position-pal/scala-template/commit/7355542ccc8b19147871d824fc224555a30c7c5e))
* **deps:** update actions/setup-node action to v4.0.4 ([9a21901](https://github.com/position-pal/scala-template/commit/9a21901a7c74d419251fd5be048bf85228dade70))
* **deps:** update dependency ubuntu to v24 ([154a434](https://github.com/position-pal/scala-template/commit/154a4344503c5a4f5adaf1e5e87c61e20dc14a21))
* do not run 'success' on skipped needed jobs ([ec0c671](https://github.com/position-pal/scala-template/commit/ec0c67148279c5ed889afcac1de040be3f601d12))
* do not run 'success' on skipped needed jobs and remove tags filter ([42231df](https://github.com/position-pal/scala-template/commit/42231df5609f4d7a8fbef7906757f9b75044bd32))
* **Mergify:** configuration update ([d88527c](https://github.com/position-pal/scala-template/commit/d88527cc9c7c363e001213162ffccf2a7a2d7989))
* move dispatcher in a separate workflow file ([5337525](https://github.com/position-pal/scala-template/commit/53375253ed86ec5833836e7b808aab6bd05df061))
* move to scala-extras plugin for qa ([f578553](https://github.com/position-pal/scala-template/commit/f578553656aa1be7f0c4c10608c0be8e767af42a))
* remove wrong/unuseful 'branches_ignore' entries and add 'workflow_dispatch' ([9141b1c](https://github.com/position-pal/scala-template/commit/9141b1c7aed3c21f39471cf3520bc22d4c90a21f))
* replace fetch tags step with fetch-tags option of checkout action ([a9ca5d6](https://github.com/position-pal/scala-template/commit/a9ca5d6848e46c6b977446d27a3a9d48d073248d))

### Refactoring

* uniform root project name ([944df82](https://github.com/position-pal/scala-template/commit/944df825f7853ee04f4625a17ca5d99ecfde86b0))

## 1.0.0 (2024-07-10)

### Features

* add scala library and scalatest support ([0572d29](https://github.com/position-pal/scala-template/commit/0572d29471eb23717ae5252078beee53211e2f4d))

### Build and continuous integration

* add build, test, check and release jobs ([bb4c711](https://github.com/position-pal/scala-template/commit/bb4c711f21000a85b343919e826cb69c5b4fb61a))
* add scalafmt and scalafix plugins ([284b37b](https://github.com/position-pal/scala-template/commit/284b37bc392f9c712210c64b1cc0f1923c072ac7))
* add semantic release configuration ([2e25341](https://github.com/position-pal/scala-template/commit/2e25341037fde106d041dbb69e0f6dedd7a877c8))
* enable automatic scan ([eea35ed](https://github.com/position-pal/scala-template/commit/eea35ed526d3339ccb6e3f963392754258021dd7))
* use versions in catalog ([94df23b](https://github.com/position-pal/scala-template/commit/94df23b10e8571b70273817de1b1a9026ae52be4))

### General maintenance

* add a simple README ([4097ba0](https://github.com/position-pal/scala-template/commit/4097ba0b3022f9c96b18175d3ae4d3b2eac410e9))
* add scalafmt and scalafix configurations ([2a8efff](https://github.com/position-pal/scala-template/commit/2a8efff1d5b56f9fe461762f09a27dbfcf29d727))

### Style improvements

* fix indentation ([011d726](https://github.com/position-pal/scala-template/commit/011d72654385be13f53a8de14cb76c1d6f112d9b))
