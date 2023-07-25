import { instantiate } from './Compose_Web_FS.uninstantiated.mjs';

await wasmSetup;
instantiate({ skia: Module['asm'] });